package com.google.vrtoolkit.cardboard.proto;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import tc.a;
import tc.b;
import tc.c;

/* loaded from: classes.dex */
public interface Phone {

    /* loaded from: classes.dex */
    public static final class PhoneParams extends c implements Cloneable {
        private static volatile PhoneParams[] _emptyArray;
        private int bitField0_;
        private float bottomBezelHeight_;
        public float[] dEPRECATEDGyroBias;
        private float xPpi_;
        private float yPpi_;

        public PhoneParams() {
            clear();
        }

        public static PhoneParams[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (b.f15414a) {
                    if (_emptyArray == null) {
                        _emptyArray = new PhoneParams[0];
                    }
                }
            }
            return _emptyArray;
        }

        public static PhoneParams parseFrom(a aVar) {
            return new PhoneParams().mergeFrom(aVar);
        }

        public static PhoneParams parseFrom(byte[] bArr) {
            return (PhoneParams) c.mergeFrom(new PhoneParams(), bArr);
        }

        public PhoneParams clear() {
            this.bitField0_ = 0;
            this.xPpi_ = 0.0f;
            this.yPpi_ = 0.0f;
            this.bottomBezelHeight_ = 0.0f;
            this.dEPRECATEDGyroBias = t3.a.n;
            this.cachedSize = -1;
            return this;
        }

        public PhoneParams clearBottomBezelHeight() {
            this.bottomBezelHeight_ = 0.0f;
            this.bitField0_ &= -5;
            return this;
        }

        public PhoneParams clearXPpi() {
            this.xPpi_ = 0.0f;
            this.bitField0_ &= -2;
            return this;
        }

        public PhoneParams clearYPpi() {
            this.yPpi_ = 0.0f;
            this.bitField0_ &= -3;
            return this;
        }

        @Override // tc.c
        /* renamed from: clone */
        public PhoneParams mo10clone() {
            try {
                PhoneParams phoneParams = (PhoneParams) super.clone();
                float[] fArr = this.dEPRECATEDGyroBias;
                if (fArr != null && fArr.length > 0) {
                    phoneParams.dEPRECATEDGyroBias = (float[]) fArr.clone();
                }
                return phoneParams;
            } catch (CloneNotSupportedException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // tc.c
        public int computeSerializedSize() {
            int computeSerializedSize = super.computeSerializedSize();
            if ((this.bitField0_ & 1) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.a(1, this.xPpi_);
            }
            if ((this.bitField0_ & 2) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.a(2, this.yPpi_);
            }
            if ((this.bitField0_ & 4) != 0) {
                computeSerializedSize += CodedOutputByteBufferNano.a(3, this.bottomBezelHeight_);
            }
            float[] fArr = this.dEPRECATEDGyroBias;
            if (fArr == null || fArr.length <= 0) {
                return computeSerializedSize;
            }
            int length = fArr.length * 4;
            return computeSerializedSize + length + 1 + CodedOutputByteBufferNano.b(length);
        }

        public float getBottomBezelHeight() {
            return this.bottomBezelHeight_;
        }

        public float getXPpi() {
            return this.xPpi_;
        }

        public float getYPpi() {
            return this.yPpi_;
        }

        public boolean hasBottomBezelHeight() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasXPpi() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasYPpi() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // tc.c
        public PhoneParams mergeFrom(a aVar) {
            int g10;
            do {
                while (true) {
                    g10 = aVar.g();
                    if (g10 == 0) {
                        return this;
                    }
                    if (g10 == 13) {
                        this.xPpi_ = aVar.b();
                        this.bitField0_ |= 1;
                    } else if (g10 == 21) {
                        this.yPpi_ = aVar.b();
                        this.bitField0_ |= 2;
                    } else if (g10 == 29) {
                        this.bottomBezelHeight_ = aVar.b();
                        this.bitField0_ |= 4;
                    } else if (g10 == 34) {
                        int e10 = aVar.e();
                        int a10 = aVar.a(e10);
                        int i10 = e10 / 4;
                        float[] fArr = this.dEPRECATEDGyroBias;
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
                        this.dEPRECATEDGyroBias = fArr2;
                        aVar.f15413g = a10;
                        aVar.h();
                    } else if (g10 != 37) {
                        break;
                    } else {
                        int k10 = t3.a.k(aVar, 37);
                        float[] fArr3 = this.dEPRECATEDGyroBias;
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
                        this.dEPRECATEDGyroBias = fArr4;
                    }
                }
            } while (aVar.i(g10));
            return this;
        }

        public PhoneParams setBottomBezelHeight(float f10) {
            this.bottomBezelHeight_ = f10;
            this.bitField0_ |= 4;
            return this;
        }

        public PhoneParams setXPpi(float f10) {
            this.xPpi_ = f10;
            this.bitField0_ |= 1;
            return this;
        }

        public PhoneParams setYPpi(float f10) {
            this.yPpi_ = f10;
            this.bitField0_ |= 2;
            return this;
        }

        @Override // tc.c
        public void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputByteBufferNano.g(1, this.xPpi_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputByteBufferNano.g(2, this.yPpi_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputByteBufferNano.g(3, this.bottomBezelHeight_);
            }
            float[] fArr = this.dEPRECATEDGyroBias;
            if (fArr != null && fArr.length > 0) {
                codedOutputByteBufferNano.k(34);
                codedOutputByteBufferNano.k(fArr.length * 4);
                int i10 = 0;
                while (true) {
                    float[] fArr2 = this.dEPRECATEDGyroBias;
                    if (i10 >= fArr2.length) {
                        break;
                    }
                    codedOutputByteBufferNano.h(fArr2[i10]);
                    i10++;
                }
            }
            super.writeTo(codedOutputByteBufferNano);
        }
    }
}
