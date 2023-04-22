package com.google.vrtoolkit.cardboard.sensors.internal;

/* loaded from: classes.dex */
public class OrientationEKF {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final double MAX_ACCEL_NOISE_SIGMA = 7.0d;
    private static final double MIN_ACCEL_NOISE_SIGMA = 0.75d;
    private static final float NS2S = 1.0E-9f;
    private boolean alignedToGravity;
    private boolean alignedToNorth;
    private float filteredGyroTimestep;
    private int numGyroTimestepSamples;
    private long sensorTimeStampGyro;
    private double[] rotationMatrix = new double[16];
    private Matrix3x3d so3SensorFromWorld = new Matrix3x3d();
    private Matrix3x3d so3LastMotion = new Matrix3x3d();
    private Matrix3x3d mP = new Matrix3x3d();
    private Matrix3x3d mQ = new Matrix3x3d();
    private Matrix3x3d mR = new Matrix3x3d();
    private Matrix3x3d mRaccel = new Matrix3x3d();
    private Matrix3x3d mS = new Matrix3x3d();
    private Matrix3x3d mH = new Matrix3x3d();
    private Matrix3x3d mK = new Matrix3x3d();
    private Vector3d mNu = new Vector3d();
    private Vector3d mz = new Vector3d();
    private Vector3d mh = new Vector3d();
    private Vector3d mu = new Vector3d();
    private Vector3d mx = new Vector3d();
    private Vector3d down = new Vector3d();
    private Vector3d north = new Vector3d();
    private final Vector3d lastGyro = new Vector3d();
    private double previousAccelNorm = 0.0d;
    private double movingAverageAccelNormChange = 0.0d;
    private boolean timestepFilterInit = false;
    private boolean gyroFilterValid = true;
    private Matrix3x3d getPredictedGLMatrixTempM1 = new Matrix3x3d();
    private Matrix3x3d getPredictedGLMatrixTempM2 = new Matrix3x3d();
    private Vector3d getPredictedGLMatrixTempV1 = new Vector3d();
    private Matrix3x3d setHeadingDegreesTempM1 = new Matrix3x3d();
    private Matrix3x3d processGyroTempM1 = new Matrix3x3d();
    private Matrix3x3d processGyroTempM2 = new Matrix3x3d();
    private Matrix3x3d processAccTempM1 = new Matrix3x3d();
    private Matrix3x3d processAccTempM2 = new Matrix3x3d();
    private Matrix3x3d processAccTempM3 = new Matrix3x3d();
    private Matrix3x3d processAccTempM4 = new Matrix3x3d();
    private Matrix3x3d processAccTempM5 = new Matrix3x3d();
    private Vector3d processAccTempV1 = new Vector3d();
    private Vector3d processAccTempV2 = new Vector3d();
    private Vector3d processAccVDelta = new Vector3d();
    private Vector3d processMagTempV1 = new Vector3d();
    private Vector3d processMagTempV2 = new Vector3d();
    private Vector3d processMagTempV3 = new Vector3d();
    private Vector3d processMagTempV4 = new Vector3d();
    private Vector3d processMagTempV5 = new Vector3d();
    private Matrix3x3d processMagTempM1 = new Matrix3x3d();
    private Matrix3x3d processMagTempM2 = new Matrix3x3d();
    private Matrix3x3d processMagTempM4 = new Matrix3x3d();
    private Matrix3x3d processMagTempM5 = new Matrix3x3d();
    private Matrix3x3d processMagTempM6 = new Matrix3x3d();
    private Matrix3x3d updateCovariancesAfterMotionTempM1 = new Matrix3x3d();
    private Matrix3x3d updateCovariancesAfterMotionTempM2 = new Matrix3x3d();
    private Matrix3x3d accObservationFunctionForNumericalJacobianTempM = new Matrix3x3d();
    private Matrix3x3d magObservationFunctionForNumericalJacobianTempM = new Matrix3x3d();

    public OrientationEKF() {
        reset();
    }

    private void accObservationFunctionForNumericalJacobian(Matrix3x3d matrix3x3d, Vector3d vector3d) {
        Matrix3x3d.mult(matrix3x3d, this.down, this.mh);
        So3Util.sO3FromTwoVec(this.mh, this.mz, this.accObservationFunctionForNumericalJacobianTempM);
        So3Util.muFromSO3(this.accObservationFunctionForNumericalJacobianTempM, vector3d);
    }

    public static void arrayAssign(double[][] dArr, Matrix3x3d matrix3x3d) {
        matrix3x3d.set(dArr[0][0], dArr[0][1], dArr[0][2], dArr[1][0], dArr[1][1], dArr[1][2], dArr[2][0], dArr[2][1], dArr[2][2]);
    }

    private void filterGyroTimestep(float f10) {
        if (!this.timestepFilterInit) {
            this.filteredGyroTimestep = f10;
            this.numGyroTimestepSamples = 1;
            this.timestepFilterInit = true;
            return;
        }
        this.filteredGyroTimestep = (f10 * 0.050000012f) + (this.filteredGyroTimestep * 0.95f);
        int i10 = this.numGyroTimestepSamples + 1;
        this.numGyroTimestepSamples = i10;
        if (i10 > 10.0f) {
            this.gyroFilterValid = true;
        }
    }

    private double[] glMatrixFromSo3(Matrix3x3d matrix3x3d) {
        for (int i10 = 0; i10 < 3; i10++) {
            for (int i11 = 0; i11 < 3; i11++) {
                this.rotationMatrix[(i11 * 4) + i10] = matrix3x3d.get(i10, i11);
            }
        }
        double[] dArr = this.rotationMatrix;
        dArr[11] = 0.0d;
        dArr[7] = 0.0d;
        dArr[3] = 0.0d;
        dArr[14] = 0.0d;
        dArr[13] = 0.0d;
        dArr[12] = 0.0d;
        dArr[15] = 1.0d;
        return dArr;
    }

    private void magObservationFunctionForNumericalJacobian(Matrix3x3d matrix3x3d, Vector3d vector3d) {
        Matrix3x3d.mult(matrix3x3d, this.north, this.mh);
        So3Util.sO3FromTwoVec(this.mh, this.mz, this.magObservationFunctionForNumericalJacobianTempM);
        So3Util.muFromSO3(this.magObservationFunctionForNumericalJacobianTempM, vector3d);
    }

    private void updateAccelCovariance(double d) {
        double abs = Math.abs(d - this.previousAccelNorm);
        this.previousAccelNorm = d;
        double d10 = (this.movingAverageAccelNormChange * 0.5d) + (abs * 0.5d);
        this.movingAverageAccelNormChange = d10;
        double min = Math.min((double) MAX_ACCEL_NOISE_SIGMA, ((d10 / 0.15d) * 6.25d) + MIN_ACCEL_NOISE_SIGMA);
        this.mRaccel.setSameDiagonal(min * min);
    }

    private void updateCovariancesAfterMotion() {
        this.so3LastMotion.transpose(this.updateCovariancesAfterMotionTempM1);
        Matrix3x3d.mult(this.mP, this.updateCovariancesAfterMotionTempM1, this.updateCovariancesAfterMotionTempM2);
        Matrix3x3d.mult(this.so3LastMotion, this.updateCovariancesAfterMotionTempM2, this.mP);
        this.so3LastMotion.setIdentity();
    }

    public double[] getGLMatrix() {
        return glMatrixFromSo3(this.so3SensorFromWorld);
    }

    public double getHeadingDegrees() {
        double d = this.so3SensorFromWorld.get(2, 0);
        double d10 = this.so3SensorFromWorld.get(2, 1);
        if (Math.sqrt((d10 * d10) + (d * d)) < 0.1d) {
            return 0.0d;
        }
        double atan2 = (-90.0d) - ((Math.atan2(d10, d) / 3.141592653589793d) * 180.0d);
        if (atan2 < 0.0d) {
            atan2 += 360.0d;
        }
        return atan2 >= 360.0d ? atan2 - 360.0d : atan2;
    }

    public double[] getPredictedGLMatrix(double d) {
        Vector3d vector3d = this.getPredictedGLMatrixTempV1;
        vector3d.set(this.lastGyro);
        vector3d.scale(-d);
        Matrix3x3d matrix3x3d = this.getPredictedGLMatrixTempM1;
        So3Util.sO3FromMu(vector3d, matrix3x3d);
        Matrix3x3d matrix3x3d2 = this.getPredictedGLMatrixTempM2;
        Matrix3x3d.mult(matrix3x3d, this.so3SensorFromWorld, matrix3x3d2);
        return glMatrixFromSo3(matrix3x3d2);
    }

    public Matrix3x3d getRotationMatrix() {
        return this.so3SensorFromWorld;
    }

    public boolean isAlignedToGravity() {
        return this.alignedToGravity;
    }

    public boolean isAlignedToNorth() {
        return this.alignedToNorth;
    }

    public boolean isReady() {
        return this.alignedToGravity;
    }

    public synchronized void processAcc(Vector3d vector3d, long j10) {
        try {
            this.mz.set(vector3d);
            updateAccelCovariance(this.mz.length());
            if (this.alignedToGravity) {
                accObservationFunctionForNumericalJacobian(this.so3SensorFromWorld, this.mNu);
                for (int i10 = 0; i10 < 3; i10++) {
                    Vector3d vector3d2 = this.processAccVDelta;
                    vector3d2.setZero();
                    vector3d2.setComponent(i10, 1.0E-7d);
                    So3Util.sO3FromMu(vector3d2, this.processAccTempM1);
                    Matrix3x3d.mult(this.processAccTempM1, this.so3SensorFromWorld, this.processAccTempM2);
                    accObservationFunctionForNumericalJacobian(this.processAccTempM2, this.processAccTempV1);
                    Vector3d.sub(this.mNu, this.processAccTempV1, this.processAccTempV2);
                    this.processAccTempV2.scale(1.0E7d);
                    this.mH.setColumn(i10, this.processAccTempV2);
                }
                this.mH.transpose(this.processAccTempM3);
                Matrix3x3d.mult(this.mP, this.processAccTempM3, this.processAccTempM4);
                Matrix3x3d.mult(this.mH, this.processAccTempM4, this.processAccTempM5);
                Matrix3x3d.add(this.processAccTempM5, this.mRaccel, this.mS);
                this.mS.invert(this.processAccTempM3);
                this.mH.transpose(this.processAccTempM4);
                Matrix3x3d.mult(this.processAccTempM4, this.processAccTempM3, this.processAccTempM5);
                Matrix3x3d.mult(this.mP, this.processAccTempM5, this.mK);
                Matrix3x3d.mult(this.mK, this.mNu, this.mx);
                Matrix3x3d.mult(this.mK, this.mH, this.processAccTempM3);
                this.processAccTempM4.setIdentity();
                this.processAccTempM4.minusEquals(this.processAccTempM3);
                Matrix3x3d.mult(this.processAccTempM4, this.mP, this.processAccTempM3);
                this.mP.set(this.processAccTempM3);
                So3Util.sO3FromMu(this.mx, this.so3LastMotion);
                Matrix3x3d matrix3x3d = this.so3LastMotion;
                Matrix3x3d matrix3x3d2 = this.so3SensorFromWorld;
                Matrix3x3d.mult(matrix3x3d, matrix3x3d2, matrix3x3d2);
                updateCovariancesAfterMotion();
            } else {
                So3Util.sO3FromTwoVec(this.down, this.mz, this.so3SensorFromWorld);
                this.alignedToGravity = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void processGyro(Vector3d vector3d, long j10) {
        try {
            long j11 = this.sensorTimeStampGyro;
            if (j11 != 0) {
                float f10 = ((float) (j10 - j11)) * NS2S;
                if (f10 > 0.04f) {
                    f10 = this.gyroFilterValid ? this.filteredGyroTimestep : 0.01f;
                } else {
                    filterGyroTimestep(f10);
                }
                this.mu.set(vector3d);
                this.mu.scale(-f10);
                So3Util.sO3FromMu(this.mu, this.so3LastMotion);
                this.processGyroTempM1.set(this.so3SensorFromWorld);
                Matrix3x3d.mult(this.so3LastMotion, this.so3SensorFromWorld, this.processGyroTempM1);
                this.so3SensorFromWorld.set(this.processGyroTempM1);
                updateCovariancesAfterMotion();
                this.processGyroTempM2.set(this.mQ);
                this.processGyroTempM2.scale(f10 * f10);
                this.mP.plusEquals(this.processGyroTempM2);
            }
            this.sensorTimeStampGyro = j10;
            this.lastGyro.set(vector3d);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void processMag(float[] fArr, long j10) {
        if (this.alignedToGravity) {
            this.mz.set(fArr[0], fArr[1], fArr[2]);
            this.mz.normalize();
            Vector3d vector3d = new Vector3d();
            this.so3SensorFromWorld.getColumn(2, vector3d);
            Vector3d.cross(this.mz, vector3d, this.processMagTempV1);
            Vector3d vector3d2 = this.processMagTempV1;
            vector3d2.normalize();
            Vector3d.cross(vector3d, vector3d2, this.processMagTempV2);
            Vector3d vector3d3 = this.processMagTempV2;
            vector3d3.normalize();
            this.mz.set(vector3d3);
            if (this.alignedToNorth) {
                magObservationFunctionForNumericalJacobian(this.so3SensorFromWorld, this.mNu);
                for (int i10 = 0; i10 < 3; i10++) {
                    Vector3d vector3d4 = this.processMagTempV3;
                    vector3d4.setZero();
                    vector3d4.setComponent(i10, 1.0E-7d);
                    So3Util.sO3FromMu(vector3d4, this.processMagTempM1);
                    Matrix3x3d.mult(this.processMagTempM1, this.so3SensorFromWorld, this.processMagTempM2);
                    magObservationFunctionForNumericalJacobian(this.processMagTempM2, this.processMagTempV4);
                    Vector3d.sub(this.mNu, this.processMagTempV4, this.processMagTempV5);
                    this.processMagTempV5.scale(1.0E7d);
                    this.mH.setColumn(i10, this.processMagTempV5);
                }
                this.mH.transpose(this.processMagTempM4);
                Matrix3x3d.mult(this.mP, this.processMagTempM4, this.processMagTempM5);
                Matrix3x3d.mult(this.mH, this.processMagTempM5, this.processMagTempM6);
                Matrix3x3d.add(this.processMagTempM6, this.mR, this.mS);
                this.mS.invert(this.processMagTempM4);
                this.mH.transpose(this.processMagTempM5);
                Matrix3x3d.mult(this.processMagTempM5, this.processMagTempM4, this.processMagTempM6);
                Matrix3x3d.mult(this.mP, this.processMagTempM6, this.mK);
                Matrix3x3d.mult(this.mK, this.mNu, this.mx);
                Matrix3x3d.mult(this.mK, this.mH, this.processMagTempM4);
                this.processMagTempM5.setIdentity();
                this.processMagTempM5.minusEquals(this.processMagTempM4);
                Matrix3x3d.mult(this.processMagTempM5, this.mP, this.processMagTempM4);
                this.mP.set(this.processMagTempM4);
                So3Util.sO3FromMu(this.mx, this.so3LastMotion);
                Matrix3x3d.mult(this.so3LastMotion, this.so3SensorFromWorld, this.processMagTempM4);
                this.so3SensorFromWorld.set(this.processMagTempM4);
                updateCovariancesAfterMotion();
            } else {
                magObservationFunctionForNumericalJacobian(this.so3SensorFromWorld, this.mNu);
                So3Util.sO3FromMu(this.mNu, this.so3LastMotion);
                Matrix3x3d.mult(this.so3LastMotion, this.so3SensorFromWorld, this.processMagTempM4);
                this.so3SensorFromWorld.set(this.processMagTempM4);
                updateCovariancesAfterMotion();
                this.alignedToNorth = true;
            }
        }
    }

    public synchronized void reset() {
        this.sensorTimeStampGyro = 0L;
        this.so3SensorFromWorld.setIdentity();
        this.so3LastMotion.setIdentity();
        this.mP.setZero();
        this.mP.setSameDiagonal(25.0d);
        this.mQ.setZero();
        this.mQ.setSameDiagonal(1.0d);
        this.mR.setZero();
        this.mR.setSameDiagonal(0.0625d);
        this.mRaccel.setZero();
        this.mRaccel.setSameDiagonal(0.5625d);
        this.mS.setZero();
        this.mH.setZero();
        this.mK.setZero();
        this.mNu.setZero();
        this.mz.setZero();
        this.mh.setZero();
        this.mu.setZero();
        this.mx.setZero();
        this.down.set(0.0d, 0.0d, 9.81d);
        this.north.set(0.0d, 1.0d, 0.0d);
        this.alignedToGravity = false;
        this.alignedToNorth = false;
    }

    public synchronized void setHeadingDegrees(double d) {
        double headingDegrees = ((d - getHeadingDegrees()) / 180.0d) * 3.141592653589793d;
        double sin = Math.sin(headingDegrees);
        double cos = Math.cos(headingDegrees);
        arrayAssign(new double[][]{new double[]{cos, -sin, 0.0d}, new double[]{sin, cos, 0.0d}, new double[]{0.0d, 0.0d, 1.0d}}, this.setHeadingDegreesTempM1);
        Matrix3x3d matrix3x3d = this.so3SensorFromWorld;
        Matrix3x3d.mult(matrix3x3d, this.setHeadingDegreesTempM1, matrix3x3d);
    }
}
