package e0;

import android.graphics.Path;
import android.util.Log;

/* loaded from: classes.dex */
public class d {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public char f8971a;

        /* renamed from: b  reason: collision with root package name */
        public float[] f8972b;

        public a(char c10, float[] fArr) {
            this.f8971a = c10;
            this.f8972b = fArr;
        }

        public a(a aVar) {
            this.f8971a = aVar.f8971a;
            float[] fArr = aVar.f8972b;
            this.f8972b = d.b(fArr, 0, fArr.length);
        }

        public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10, boolean z11) {
            double d;
            double d10;
            double radians = Math.toRadians(f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d11 = f10;
            double d12 = f11;
            double d13 = (d12 * sin) + (d11 * cos);
            double d14 = d11;
            double d15 = f14;
            double d16 = d13 / d15;
            double d17 = f15;
            double d18 = ((d12 * cos) + ((-f10) * sin)) / d17;
            double d19 = d12;
            double d20 = f13;
            double d21 = ((d20 * sin) + (f12 * cos)) / d15;
            double d22 = ((d20 * cos) + ((-f12) * sin)) / d17;
            double d23 = d16 - d21;
            double d24 = d18 - d22;
            double d25 = (d16 + d21) / 2.0d;
            double d26 = (d18 + d22) / 2.0d;
            double d27 = (d24 * d24) + (d23 * d23);
            if (d27 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d28 = (1.0d / d27) - 0.25d;
            if (d28 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d27);
                float sqrt = (float) (Math.sqrt(d27) / 1.99999d);
                a(path, f10, f11, f12, f13, f14 * sqrt, f15 * sqrt, f16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d28);
            double d29 = d23 * sqrt2;
            double d30 = sqrt2 * d24;
            if (z10 == z11) {
                d = d25 - d30;
                d10 = d26 + d29;
            } else {
                d = d25 + d30;
                d10 = d26 - d29;
            }
            double atan2 = Math.atan2(d18 - d10, d16 - d);
            double atan22 = Math.atan2(d22 - d10, d21 - d) - atan2;
            int i10 = 0;
            int i11 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z11 != (i11 >= 0)) {
                atan22 = i11 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d31 = d * d15;
            double d32 = d10 * d17;
            double d33 = (d31 * cos) - (d32 * sin);
            double d34 = (d32 * cos) + (d31 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d35 = -d15;
            double d36 = d35 * cos2;
            double d37 = d17 * sin2;
            double d38 = (d36 * sin3) - (d37 * cos3);
            double d39 = d35 * sin2;
            double d40 = d17 * cos2;
            double d41 = (cos3 * d40) + (sin3 * d39);
            double d42 = atan22 / ceil;
            double d43 = atan2;
            while (i10 < ceil) {
                double d44 = d43 + d42;
                double sin4 = Math.sin(d44);
                double cos4 = Math.cos(d44);
                double d45 = d42;
                double d46 = (((d15 * cos2) * cos4) + d33) - (d37 * sin4);
                double d47 = d33;
                double d48 = (d40 * sin4) + (d15 * sin2 * cos4) + d34;
                double d49 = (d36 * sin4) - (d37 * cos4);
                double d50 = (cos4 * d40) + (sin4 * d39);
                double d51 = d44 - d43;
                double tan = Math.tan(d51 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d51)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d38 * sqrt3) + d14), (float) ((d41 * sqrt3) + d19), (float) (d46 - (sqrt3 * d49)), (float) (d48 - (sqrt3 * d50)), (float) d46, (float) d48);
                i10++;
                d40 = d40;
                d39 = d39;
                ceil = ceil;
                cos2 = cos2;
                d43 = d44;
                d15 = d15;
                d41 = d50;
                d38 = d49;
                d14 = d46;
                d19 = d48;
                d42 = d45;
                d33 = d47;
            }
        }

        public static void b(a[] aVarArr, Path path) {
            int i10;
            int i11;
            float[] fArr;
            char c10;
            int i12;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            float f21;
            float f22;
            float f23;
            float f24;
            float f25;
            float f26;
            float f27;
            float f28;
            a[] aVarArr2 = aVarArr;
            float[] fArr2 = new float[6];
            char c11 = 'm';
            char c12 = 0;
            char c13 = 'm';
            int i13 = 0;
            while (i13 < aVarArr2.length) {
                char c14 = aVarArr2[i13].f8971a;
                float[] fArr3 = aVarArr2[i13].f8972b;
                float f29 = fArr2[c12];
                float f30 = fArr2[1];
                float f31 = fArr2[2];
                float f32 = fArr2[3];
                float f33 = fArr2[4];
                float f34 = fArr2[5];
                switch (c14) {
                    case 'A':
                    case 'a':
                        i10 = 7;
                        break;
                    case 'C':
                    case 'c':
                        i10 = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i10 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i10 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f33, f34);
                        f29 = f33;
                        f31 = f29;
                        f30 = f34;
                        f32 = f30;
                    default:
                        i10 = 2;
                        break;
                }
                float f35 = f33;
                float f36 = f34;
                float f37 = f29;
                float f38 = f30;
                int i14 = 0;
                while (i14 < fArr3.length) {
                    if (c14 != 'A') {
                        if (c14 != 'C') {
                            if (c14 == 'H') {
                                i11 = i14;
                                fArr = fArr3;
                                c10 = c14;
                                i12 = i13;
                                int i15 = i11 + 0;
                                path.lineTo(fArr[i15], f38);
                                f37 = fArr[i15];
                            } else if (c14 == 'Q') {
                                i11 = i14;
                                fArr = fArr3;
                                c10 = c14;
                                i12 = i13;
                                int i16 = i11 + 0;
                                int i17 = i11 + 1;
                                int i18 = i11 + 2;
                                int i19 = i11 + 3;
                                path.quadTo(fArr[i16], fArr[i17], fArr[i18], fArr[i19]);
                                f10 = fArr[i16];
                                f11 = fArr[i17];
                                f37 = fArr[i18];
                                f38 = fArr[i19];
                            } else if (c14 == 'V') {
                                i11 = i14;
                                fArr = fArr3;
                                c10 = c14;
                                i12 = i13;
                                int i20 = i11 + 0;
                                path.lineTo(f37, fArr[i20]);
                                f38 = fArr[i20];
                            } else if (c14 != 'a') {
                                if (c14 != 'c') {
                                    if (c14 == 'h') {
                                        i11 = i14;
                                        int i21 = i11 + 0;
                                        path.rLineTo(fArr3[i21], 0.0f);
                                        f37 += fArr3[i21];
                                    } else if (c14 != 'q') {
                                        if (c14 == 'v') {
                                            i11 = i14;
                                            f19 = f38;
                                            int i22 = i11 + 0;
                                            path.rLineTo(0.0f, fArr3[i22]);
                                            f20 = fArr3[i22];
                                        } else if (c14 == 'L') {
                                            i11 = i14;
                                            int i23 = i11 + 0;
                                            int i24 = i11 + 1;
                                            path.lineTo(fArr3[i23], fArr3[i24]);
                                            f37 = fArr3[i23];
                                            f38 = fArr3[i24];
                                        } else if (c14 == 'M') {
                                            i11 = i14;
                                            int i25 = i11 + 0;
                                            float f39 = fArr3[i25];
                                            int i26 = i11 + 1;
                                            float f40 = fArr3[i26];
                                            if (i11 > 0) {
                                                path.lineTo(fArr3[i25], fArr3[i26]);
                                                f37 = f39;
                                                f38 = f40;
                                            } else {
                                                path.moveTo(fArr3[i25], fArr3[i26]);
                                                f35 = f39;
                                                f36 = f40;
                                                f37 = f35;
                                                f38 = f36;
                                            }
                                        } else if (c14 == 'S') {
                                            i11 = i14;
                                            float f41 = f38;
                                            float f42 = f37;
                                            if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                f21 = (f41 * 2.0f) - f32;
                                                f22 = (f42 * 2.0f) - f31;
                                            } else {
                                                f22 = f42;
                                                f21 = f41;
                                            }
                                            int i27 = i11 + 0;
                                            int i28 = i11 + 1;
                                            int i29 = i11 + 2;
                                            int i30 = i11 + 3;
                                            path.cubicTo(f22, f21, fArr3[i27], fArr3[i28], fArr3[i29], fArr3[i30]);
                                            float f43 = fArr3[i27];
                                            float f44 = fArr3[i28];
                                            f18 = fArr3[i29];
                                            f17 = fArr3[i30];
                                            f31 = f43;
                                            f32 = f44;
                                            f37 = f18;
                                            f38 = f17;
                                        } else if (c14 == 'T') {
                                            i11 = i14;
                                            float f45 = f38;
                                            float f46 = f37;
                                            if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                f23 = (f46 * 2.0f) - f31;
                                                f24 = (f45 * 2.0f) - f32;
                                            } else {
                                                f23 = f46;
                                                f24 = f45;
                                            }
                                            int i31 = i11 + 0;
                                            int i32 = i11 + 1;
                                            path.quadTo(f23, f24, fArr3[i31], fArr3[i32]);
                                            f32 = f24;
                                            f31 = f23;
                                            fArr = fArr3;
                                            c10 = c14;
                                            i12 = i13;
                                            f37 = fArr3[i31];
                                            f38 = fArr3[i32];
                                        } else if (c14 == 'l') {
                                            i11 = i14;
                                            f19 = f38;
                                            int i33 = i11 + 0;
                                            int i34 = i11 + 1;
                                            path.rLineTo(fArr3[i33], fArr3[i34]);
                                            f37 += fArr3[i33];
                                            f20 = fArr3[i34];
                                        } else if (c14 == c11) {
                                            i11 = i14;
                                            int i35 = i11 + 0;
                                            f37 += fArr3[i35];
                                            int i36 = i11 + 1;
                                            f38 += fArr3[i36];
                                            if (i11 > 0) {
                                                path.rLineTo(fArr3[i35], fArr3[i36]);
                                            } else {
                                                path.rMoveTo(fArr3[i35], fArr3[i36]);
                                                f36 = f38;
                                                f35 = f37;
                                                f37 = f35;
                                                f38 = f36;
                                            }
                                        } else if (c14 != 's') {
                                            if (c14 == 't') {
                                                if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                    f27 = f37 - f31;
                                                    f28 = f38 - f32;
                                                } else {
                                                    f28 = 0.0f;
                                                    f27 = 0.0f;
                                                }
                                                int i37 = i14 + 0;
                                                int i38 = i14 + 1;
                                                path.rQuadTo(f27, f28, fArr3[i37], fArr3[i38]);
                                                float f47 = f27 + f37;
                                                float f48 = f28 + f38;
                                                f37 += fArr3[i37];
                                                f38 += fArr3[i38];
                                                f32 = f48;
                                                f31 = f47;
                                            }
                                            i11 = i14;
                                        } else {
                                            if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                f25 = f38 - f32;
                                                f26 = f37 - f31;
                                            } else {
                                                f26 = 0.0f;
                                                f25 = 0.0f;
                                            }
                                            int i39 = i14 + 0;
                                            int i40 = i14 + 1;
                                            int i41 = i14 + 2;
                                            int i42 = i14 + 3;
                                            i11 = i14;
                                            f12 = f38;
                                            float f49 = f37;
                                            path.rCubicTo(f26, f25, fArr3[i39], fArr3[i40], fArr3[i41], fArr3[i42]);
                                            f13 = fArr3[i39] + f49;
                                            f14 = fArr3[i40] + f12;
                                            f15 = f49 + fArr3[i41];
                                            f16 = fArr3[i42];
                                        }
                                        f38 = f19 + f20;
                                    } else {
                                        i11 = i14;
                                        f12 = f38;
                                        float f50 = f37;
                                        int i43 = i11 + 0;
                                        int i44 = i11 + 1;
                                        int i45 = i11 + 2;
                                        int i46 = i11 + 3;
                                        path.rQuadTo(fArr3[i43], fArr3[i44], fArr3[i45], fArr3[i46]);
                                        f13 = fArr3[i43] + f50;
                                        f14 = fArr3[i44] + f12;
                                        float f51 = f50 + fArr3[i45];
                                        float f52 = fArr3[i46];
                                        f15 = f51;
                                        f16 = f52;
                                    }
                                    fArr = fArr3;
                                    c10 = c14;
                                    i12 = i13;
                                } else {
                                    i11 = i14;
                                    f12 = f38;
                                    float f53 = f37;
                                    int i47 = i11 + 2;
                                    int i48 = i11 + 3;
                                    int i49 = i11 + 4;
                                    int i50 = i11 + 5;
                                    path.rCubicTo(fArr3[i11 + 0], fArr3[i11 + 1], fArr3[i47], fArr3[i48], fArr3[i49], fArr3[i50]);
                                    f13 = fArr3[i47] + f53;
                                    f14 = fArr3[i48] + f12;
                                    f15 = f53 + fArr3[i49];
                                    f16 = fArr3[i50];
                                }
                                f17 = f12 + f16;
                                f31 = f13;
                                f32 = f14;
                                f18 = f15;
                                f37 = f18;
                                f38 = f17;
                                fArr = fArr3;
                                c10 = c14;
                                i12 = i13;
                            } else {
                                i11 = i14;
                                float f54 = f38;
                                float f55 = f37;
                                int i51 = i11 + 5;
                                int i52 = i11 + 6;
                                fArr = fArr3;
                                c10 = c14;
                                i12 = i13;
                                a(path, f55, f54, fArr3[i51] + f55, fArr3[i52] + f54, fArr3[i11 + 0], fArr3[i11 + 1], fArr3[i11 + 2], fArr3[i11 + 3] != 0.0f, fArr3[i11 + 4] != 0.0f);
                                f37 = f55 + fArr[i51];
                                f38 = f54 + fArr[i52];
                            }
                            i14 = i11 + i10;
                            c13 = c10;
                            c14 = c13;
                            fArr3 = fArr;
                            i13 = i12;
                            c11 = 'm';
                        } else {
                            i11 = i14;
                            fArr = fArr3;
                            c10 = c14;
                            i12 = i13;
                            int i53 = i11 + 2;
                            int i54 = i11 + 3;
                            int i55 = i11 + 4;
                            int i56 = i11 + 5;
                            path.cubicTo(fArr[i11 + 0], fArr[i11 + 1], fArr[i53], fArr[i54], fArr[i55], fArr[i56]);
                            float f56 = fArr[i55];
                            float f57 = fArr[i56];
                            f10 = fArr[i53];
                            f37 = f56;
                            f38 = f57;
                            f11 = fArr[i54];
                        }
                        f31 = f10;
                        f32 = f11;
                        i14 = i11 + i10;
                        c13 = c10;
                        c14 = c13;
                        fArr3 = fArr;
                        i13 = i12;
                        c11 = 'm';
                    } else {
                        i11 = i14;
                        fArr = fArr3;
                        c10 = c14;
                        i12 = i13;
                        int i57 = i11 + 5;
                        int i58 = i11 + 6;
                        a(path, f37, f38, fArr[i57], fArr[i58], fArr[i11 + 0], fArr[i11 + 1], fArr[i11 + 2], fArr[i11 + 3] != 0.0f, fArr[i11 + 4] != 0.0f);
                        f37 = fArr[i57];
                        f38 = fArr[i58];
                    }
                    f32 = f38;
                    f31 = f37;
                    i14 = i11 + i10;
                    c13 = c10;
                    c14 = c13;
                    fArr3 = fArr;
                    i13 = i12;
                    c11 = 'm';
                }
                int i59 = i13;
                fArr2[0] = f37;
                fArr2[1] = f38;
                fArr2[2] = f31;
                fArr2[3] = f32;
                fArr2[4] = f35;
                fArr2[5] = f36;
                i13 = i59 + 1;
                c13 = aVarArr[i59].f8971a;
                c11 = 'm';
                c12 = 0;
                aVarArr2 = aVarArr;
            }
        }
    }

    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr != null && aVarArr2 != null && aVarArr.length == aVarArr2.length) {
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                if (aVarArr[i10].f8971a != aVarArr2[i10].f8971a || aVarArr[i10].f8972b.length != aVarArr2[i10].f8972b.length) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static float[] b(float[] fArr, int i10, int i11) {
        if (i10 <= i11) {
            int length = fArr.length;
            if (i10 < 0 || i10 > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i12 = i11 - i10;
            int min = Math.min(i12, length - i10);
            float[] fArr2 = new float[i12];
            System.arraycopy(fArr, i10, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0099, code lost:
        if (r13 == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6 A[Catch: NumberFormatException -> 0x00ca, LOOP:3: B:29:0x0079->B:49:0x00a6, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ca, blocks: (B:26:0x0063, B:29:0x0079, B:31:0x007f, B:36:0x008f, B:49:0x00a6, B:51:0x00ab, B:54:0x00bb, B:56:0x00c1), top: B:71:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab A[Catch: NumberFormatException -> 0x00ca, TryCatch #0 {NumberFormatException -> 0x00ca, blocks: (B:26:0x0063, B:29:0x0079, B:31:0x007f, B:36:0x008f, B:49:0x00a6, B:51:0x00ab, B:54:0x00bb, B:56:0x00c1), top: B:71:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb A[Catch: NumberFormatException -> 0x00ca, TryCatch #0 {NumberFormatException -> 0x00ca, blocks: (B:26:0x0063, B:29:0x0079, B:31:0x007f, B:36:0x008f, B:49:0x00a6, B:51:0x00ab, B:54:0x00bb, B:56:0x00c1), top: B:71:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e0.d.a[] c(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.d.c(java.lang.String):e0.d$a[]");
    }

    public static Path d(String str) {
        Path path = new Path();
        a[] c10 = c(str);
        if (c10 != null) {
            try {
                a.b(c10, path);
                return path;
            } catch (RuntimeException e10) {
                throw new RuntimeException(a1.a.l("Error in parsing ", str), e10);
            }
        }
        return null;
    }

    public static a[] e(a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            aVarArr2[i10] = new a(aVarArr[i10]);
        }
        return aVarArr2;
    }
}
