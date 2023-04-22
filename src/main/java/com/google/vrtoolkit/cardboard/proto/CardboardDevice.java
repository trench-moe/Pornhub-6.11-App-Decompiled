package com.google.vrtoolkit.cardboard.proto;

import com.appsflyer.oaid.BuildConfig;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Objects;
import tc.a;
import tc.b;
import tc.c;

/* loaded from: classes.dex */
public interface CardboardDevice {

    /* loaded from: classes.dex */
    public static final class DeviceParams extends c implements Cloneable {
        private static volatile DeviceParams[] _emptyArray;
        private int bitField0_;
        public float[] distortionCoefficients;
        private boolean hasMagnet_;
        private float interLensDistance_;
        public float[] leftEyeFieldOfViewAngles;
        private String model_;
        private int primaryButton_;
        private float screenToLensDistance_;
        private float trayToLensDistance_;
        private String vendor_;
        private int verticalAlignment_;

        /* loaded from: classes.dex */
        public interface ButtonType {
            public static final int INDIRECT_TOUCH = 3;
            public static final int MAGNET = 1;
            public static final int NONE = 0;
            public static final int TOUCH = 2;
        }

        /* loaded from: classes.dex */
        public interface VerticalAlignmentType {
            public static final int BOTTOM = 0;
            public static final int CENTER = 1;
            public static final int TOP = 2;
        }

        public DeviceParams() {
            clear();
        }

        public static DeviceParams[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (b.f15414a) {
                    if (_emptyArray == null) {
                        _emptyArray = new DeviceParams[0];
                    }
                }
            }
            return _emptyArray;
        }

        public static DeviceParams parseFrom(a aVar) {
            return new DeviceParams().mergeFrom(aVar);
        }

        public static DeviceParams parseFrom(byte[] bArr) {
            return (DeviceParams) c.mergeFrom(new DeviceParams(), bArr);
        }

        public DeviceParams clear() {
            this.bitField0_ = 0;
            this.vendor_ = BuildConfig.FLAVOR;
            this.model_ = BuildConfig.FLAVOR;
            this.screenToLensDistance_ = 0.0f;
            this.interLensDistance_ = 0.0f;
            float[] fArr = t3.a.n;
            this.leftEyeFieldOfViewAngles = fArr;
            this.verticalAlignment_ = 0;
            this.trayToLensDistance_ = 0.0f;
            this.distortionCoefficients = fArr;
            this.hasMagnet_ = false;
            this.primaryButton_ = 1;
            this.cachedSize = -1;
            return this;
        }

        public DeviceParams clearHasMagnet() {
            this.hasMagnet_ = false;
            this.bitField0_ &= -65;
            return this;
        }

        public DeviceParams clearInterLensDistance() {
            this.interLensDistance_ = 0.0f;
            this.bitField0_ &= -9;
            return this;
        }

        public DeviceParams clearModel() {
            this.model_ = BuildConfig.FLAVOR;
            this.bitField0_ &= -3;
            return this;
        }

        public DeviceParams clearPrimaryButton() {
            this.primaryButton_ = 1;
            this.bitField0_ &= -129;
            return this;
        }

        public DeviceParams clearScreenToLensDistance() {
            this.screenToLensDistance_ = 0.0f;
            this.bitField0_ &= -5;
            return this;
        }

        public DeviceParams clearTrayToLensDistance() {
            this.trayToLensDistance_ = 0.0f;
            this.bitField0_ &= -33;
            return this;
        }

        public DeviceParams clearVendor() {
            this.vendor_ = BuildConfig.FLAVOR;
            this.bitField0_ &= -2;
            return this;
        }

        public DeviceParams clearVerticalAlignment() {
            this.verticalAlignment_ = 0;
            this.bitField0_ &= -17;
            return this;
        }

        @Override // tc.c
        /* renamed from: clone */
        public DeviceParams mo10clone() {
            try {
                DeviceParams deviceParams = (DeviceParams) super.clone();
                float[] fArr = this.leftEyeFieldOfViewAngles;
                if (fArr != null && fArr.length > 0) {
                    deviceParams.leftEyeFieldOfViewAngles = (float[]) fArr.clone();
                }
                float[] fArr2 = this.distortionCoefficients;
                if (fArr2 != null && fArr2.length > 0) {
                    deviceParams.distortionCoefficients = (float[]) fArr2.clone();
                }
                return deviceParams;
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // tc.c
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if ((this.bitField0_ & 1) != 0) {
                String str = this.vendor_;
                int c10 = CodedOutputByteBufferNano.c(1);
                int f10 = CodedOutputByteBufferNano.f(str);
                computeSerializedSize += CodedOutputByteBufferNano.b(f10) + f10 + c10;
            }
            if ((this.bitField0_ & 2) != 0) {
                String str2 = this.model_;
                int c11 = CodedOutputByteBufferNano.c(2);
                int f11 = CodedOutputByteBufferNano.f(str2);
                computeSerializedSize += CodedOutputByteBufferNano.b(f11) + f11 + c11;
            }
            if ((this.bitField0_ & 4) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.a(3, this.screenToLensDistance_);
            }
            if ((this.bitField0_ & 8) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.a(4, this.interLensDistance_);
            }
            float[] fArr = this.leftEyeFieldOfViewAngles;
            if (fArr != null && fArr.length > 0) {
                int length = fArr.length * 4;
                computeSerializedSize = computeSerializedSize + length + 1 + CodedOutputByteBufferNano.b(length);
            }
            if ((this.bitField0_ & 32) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.a(6, this.trayToLensDistance_);
            }
            float[] fArr2 = this.distortionCoefficients;
            if (fArr2 != null && fArr2.length > 0) {
                int length2 = fArr2.length * 4;
                computeSerializedSize = computeSerializedSize + length2 + 1 + CodedOutputByteBufferNano.b(length2);
            }
            int i10 = 10;
            if ((this.bitField0_ & 64) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.c(10) + 1;
            }
            if ((this.bitField0_ & 16) != 0) {
                int i11 = this.verticalAlignment_;
                computeSerializedSize += CodedOutputByteBufferNano.c(11) + (i11 >= 0 ? CodedOutputByteBufferNano.b(i11) : 10);
            }
            if ((this.bitField0_ & 128) != 0) {
                int i12 = this.primaryButton_;
                int c12 = CodedOutputByteBufferNano.c(12);
                if (i12 >= 0) {
                    i10 = CodedOutputByteBufferNano.b(i12);
                }
                computeSerializedSize += c12 + i10;
            }
            return computeSerializedSize;
        }

        public boolean getHasMagnet() {
            return this.hasMagnet_;
        }

        public float getInterLensDistance() {
            return this.interLensDistance_;
        }

        public String getModel() {
            return this.model_;
        }

        public int getPrimaryButton() {
            return this.primaryButton_;
        }

        public float getScreenToLensDistance() {
            return this.screenToLensDistance_;
        }

        public float getTrayToLensDistance() {
            return this.trayToLensDistance_;
        }

        public String getVendor() {
            return this.vendor_;
        }

        public int getVerticalAlignment() {
            return this.verticalAlignment_;
        }

        public boolean hasHasMagnet() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasInterLensDistance() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasModel() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPrimaryButton() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasScreenToLensDistance() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTrayToLensDistance() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasVendor() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVerticalAlignment() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // tc.c
        public DeviceParams mergeFrom(a aVar) {
            int g10;
            do {
                while (true) {
                    g10 = aVar.g();
                    boolean z10 = true;
                    switch (g10) {
                        case 0:
                            return this;
                        case 10:
                            this.vendor_ = aVar.f();
                            this.bitField0_ |= 1;
                        case 18:
                            this.model_ = aVar.f();
                            this.bitField0_ |= 2;
                        case 29:
                            this.screenToLensDistance_ = aVar.b();
                            this.bitField0_ |= 4;
                        case 37:
                            this.interLensDistance_ = aVar.b();
                            this.bitField0_ |= 8;
                        case 42:
                            int e10 = aVar.e();
                            int a10 = aVar.a(e10);
                            int i10 = e10 / 4;
                            float[] fArr = this.leftEyeFieldOfViewAngles;
                            int length = fArr == null ? 0 : fArr.length;
                            int i11 = i10 + length;
                            float[] fArr2 = new float[i11];
                            if (length != 0) {
                                System.arraycopy(fArr, 0, fArr2, 0, length);
                            }
                            while (length < i11) {
                                fArr2[length] = aVar.b();
                                length++;
                            }
                            this.leftEyeFieldOfViewAngles = fArr2;
                            aVar.f15413g = a10;
                            aVar.h();
                        case 45:
                            int k10 = t3.a.k(aVar, 45);
                            float[] fArr3 = this.leftEyeFieldOfViewAngles;
                            int length2 = fArr3 == null ? 0 : fArr3.length;
                            int i12 = k10 + length2;
                            float[] fArr4 = new float[i12];
                            if (length2 != 0) {
                                System.arraycopy(fArr3, 0, fArr4, 0, length2);
                            }
                            while (length2 < i12 - 1) {
                                fArr4[length2] = aVar.b();
                                aVar.g();
                                length2++;
                            }
                            fArr4[length2] = aVar.b();
                            this.leftEyeFieldOfViewAngles = fArr4;
                        case 53:
                            this.trayToLensDistance_ = aVar.b();
                            this.bitField0_ |= 32;
                        case 58:
                            int e11 = aVar.e();
                            int a11 = aVar.a(e11);
                            int i13 = e11 / 4;
                            float[] fArr5 = this.distortionCoefficients;
                            int length3 = fArr5 == null ? 0 : fArr5.length;
                            int i14 = i13 + length3;
                            float[] fArr6 = new float[i14];
                            if (length3 != 0) {
                                System.arraycopy(fArr5, 0, fArr6, 0, length3);
                            }
                            while (length3 < i14) {
                                fArr6[length3] = aVar.b();
                                length3++;
                            }
                            this.distortionCoefficients = fArr6;
                            aVar.f15413g = a11;
                            aVar.h();
                        case 61:
                            int k11 = t3.a.k(aVar, 61);
                            float[] fArr7 = this.distortionCoefficients;
                            int length4 = fArr7 == null ? 0 : fArr7.length;
                            int i15 = k11 + length4;
                            float[] fArr8 = new float[i15];
                            if (length4 != 0) {
                                System.arraycopy(fArr7, 0, fArr8, 0, length4);
                            }
                            while (length4 < i15 - 1) {
                                fArr8[length4] = aVar.b();
                                aVar.g();
                                length4++;
                            }
                            fArr8[length4] = aVar.b();
                            this.distortionCoefficients = fArr8;
                        case 80:
                            if (aVar.e() == 0) {
                                z10 = false;
                            }
                            this.hasMagnet_ = z10;
                            this.bitField0_ |= 64;
                        case 88:
                            int e12 = aVar.e();
                            if (e12 == 0 || e12 == 1 || e12 == 2) {
                                this.verticalAlignment_ = e12;
                                this.bitField0_ |= 16;
                            }
                            break;
                        case 96:
                            int e13 = aVar.e();
                            if (e13 == 0 || e13 == 1 || e13 == 2 || e13 == 3) {
                                this.primaryButton_ = e13;
                                this.bitField0_ |= 128;
                            }
                            break;
                    }
                }
            } while (aVar.i(g10));
            return this;
        }

        public DeviceParams setHasMagnet(boolean z10) {
            this.hasMagnet_ = z10;
            this.bitField0_ |= 64;
            return this;
        }

        public DeviceParams setInterLensDistance(float f10) {
            this.interLensDistance_ = f10;
            this.bitField0_ |= 8;
            return this;
        }

        public DeviceParams setModel(String str) {
            Objects.requireNonNull(str);
            this.model_ = str;
            this.bitField0_ |= 2;
            return this;
        }

        public DeviceParams setPrimaryButton(int i10) {
            this.primaryButton_ = i10;
            this.bitField0_ |= 128;
            return this;
        }

        public DeviceParams setScreenToLensDistance(float f10) {
            this.screenToLensDistance_ = f10;
            this.bitField0_ |= 4;
            return this;
        }

        public DeviceParams setTrayToLensDistance(float f10) {
            this.trayToLensDistance_ = f10;
            this.bitField0_ |= 32;
            return this;
        }

        public DeviceParams setVendor(String str) {
            Objects.requireNonNull(str);
            this.vendor_ = str;
            this.bitField0_ |= 1;
            return this;
        }

        public DeviceParams setVerticalAlignment(int i10) {
            this.verticalAlignment_ = i10;
            this.bitField0_ |= 16;
            return this;
        }

        @Override // tc.c
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputByteBufferNano.l(1, this.vendor_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputByteBufferNano.l(2, this.model_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputByteBufferNano.g(3, this.screenToLensDistance_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputByteBufferNano.g(4, this.interLensDistance_);
            }
            float[] fArr = this.leftEyeFieldOfViewAngles;
            int i10 = 0;
            if (fArr != null && fArr.length > 0) {
                codedOutputByteBufferNano.k(42);
                codedOutputByteBufferNano.k(fArr.length * 4);
                int i11 = 0;
                while (true) {
                    float[] fArr2 = this.leftEyeFieldOfViewAngles;
                    if (i11 >= fArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.h(fArr2[i11]);
                    i11++;
                }
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputByteBufferNano.g(6, this.trayToLensDistance_);
            }
            float[] fArr3 = this.distortionCoefficients;
            if (fArr3 != null && fArr3.length > 0) {
                codedOutputByteBufferNano.k(58);
                codedOutputByteBufferNano.k(fArr3.length * 4);
                while (true) {
                    float[] fArr4 = this.distortionCoefficients;
                    if (i10 >= fArr4.length) {
                        break;
                    }
                    codedOutputByteBufferNano.h(fArr4[i10]);
                    i10++;
                }
            }
            if ((this.bitField0_ & 64) != 0) {
                boolean z10 = this.hasMagnet_;
                codedOutputByteBufferNano.k(80);
                codedOutputByteBufferNano.j(z10 ? 1 : 0);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputByteBufferNano.i(11, this.verticalAlignment_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputByteBufferNano.i(12, this.primaryButton_);
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}
