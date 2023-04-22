package je;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.renderscript.RSRuntimeException;
import android.view.View;
import java.lang.reflect.Array;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class a {
    public static Bitmap a(Context context, Bitmap bitmap, b bVar) {
        boolean z10;
        int[] iArr;
        b bVar2 = bVar;
        int i10 = bVar2.f11701a;
        int i11 = bVar2.d;
        int i12 = i10 / i11;
        int i13 = bVar2.f11702b / i11;
        int[] iArr2 = {i12, i13};
        int i14 = 0;
        while (true) {
            if (i14 >= 2) {
                z10 = false;
                break;
            } else if (iArr2[i14] == 0) {
                z10 = true;
                break;
            } else {
                i14++;
            }
        }
        Bitmap bitmap2 = null;
        if (z10) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i15 = bVar2.d;
        canvas.scale(1.0f / i15, 1.0f / i15);
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(bVar2.f11704e, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            c(context, createBitmap, bVar2.f11703c);
        } catch (RSRuntimeException unused) {
            int i16 = bVar2.f11703c;
            if (i16 >= 1) {
                int width = createBitmap.getWidth();
                int height = createBitmap.getHeight();
                int i17 = width * height;
                int[] iArr3 = new int[i17];
                createBitmap.getPixels(iArr3, 0, width, 0, 0, width, height);
                int i18 = width - 1;
                int i19 = height - 1;
                int i20 = i16 + i16 + 1;
                int[] iArr4 = new int[i17];
                int[] iArr5 = new int[i17];
                int[] iArr6 = new int[i17];
                int[] iArr7 = new int[Math.max(width, height)];
                int i21 = (i20 + 1) >> 1;
                int i22 = i21 * i21;
                int i23 = i22 * 256;
                int[] iArr8 = new int[i23];
                for (int i24 = 0; i24 < i23; i24++) {
                    iArr8[i24] = i24 / i22;
                }
                int[][] iArr9 = (int[][]) Array.newInstance(int.class, i20, 3);
                int i25 = i16 + 1;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (i26 < height) {
                    int i29 = -i16;
                    int i30 = 0;
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = 0;
                    int i36 = 0;
                    int i37 = 0;
                    int i38 = 0;
                    while (i29 <= i16) {
                        Bitmap bitmap3 = createBitmap;
                        int i39 = height;
                        int i40 = iArr3[Math.min(i18, Math.max(i29, 0)) + i27];
                        int[] iArr10 = iArr9[i29 + i16];
                        iArr10[0] = (i40 & 16711680) >> 16;
                        iArr10[1] = (i40 & 65280) >> 8;
                        iArr10[2] = i40 & KotlinVersion.MAX_COMPONENT_VALUE;
                        int abs = i25 - Math.abs(i29);
                        i30 = (iArr10[0] * abs) + i30;
                        i31 = (iArr10[1] * abs) + i31;
                        i32 = (iArr10[2] * abs) + i32;
                        if (i29 > 0) {
                            i36 += iArr10[0];
                            i37 += iArr10[1];
                            i38 += iArr10[2];
                        } else {
                            i33 += iArr10[0];
                            i34 += iArr10[1];
                            i35 += iArr10[2];
                        }
                        i29++;
                        height = i39;
                        createBitmap = bitmap3;
                    }
                    Bitmap bitmap4 = createBitmap;
                    int i41 = height;
                    int i42 = i16;
                    int i43 = 0;
                    while (i43 < width) {
                        iArr4[i27] = iArr8[i30];
                        iArr5[i27] = iArr8[i31];
                        iArr6[i27] = iArr8[i32];
                        int i44 = i30 - i33;
                        int i45 = i31 - i34;
                        int i46 = i32 - i35;
                        int[] iArr11 = iArr9[((i42 - i16) + i20) % i20];
                        int i47 = i33 - iArr11[0];
                        int i48 = i34 - iArr11[1];
                        int i49 = i35 - iArr11[2];
                        if (i26 == 0) {
                            iArr = iArr8;
                            iArr7[i43] = Math.min(i43 + i16 + 1, i18);
                        } else {
                            iArr = iArr8;
                        }
                        int i50 = iArr3[i28 + iArr7[i43]];
                        iArr11[0] = (i50 & 16711680) >> 16;
                        iArr11[1] = (i50 & 65280) >> 8;
                        iArr11[2] = i50 & KotlinVersion.MAX_COMPONENT_VALUE;
                        int i51 = i36 + iArr11[0];
                        int i52 = i37 + iArr11[1];
                        int i53 = i38 + iArr11[2];
                        i30 = i44 + i51;
                        i31 = i45 + i52;
                        i32 = i46 + i53;
                        i42 = (i42 + 1) % i20;
                        int[] iArr12 = iArr9[i42 % i20];
                        i33 = i47 + iArr12[0];
                        i34 = i48 + iArr12[1];
                        i35 = i49 + iArr12[2];
                        i36 = i51 - iArr12[0];
                        i37 = i52 - iArr12[1];
                        i38 = i53 - iArr12[2];
                        i27++;
                        i43++;
                        iArr8 = iArr;
                    }
                    i28 += width;
                    i26++;
                    height = i41;
                    createBitmap = bitmap4;
                }
                Bitmap bitmap5 = createBitmap;
                int[] iArr13 = iArr8;
                int i54 = height;
                int i55 = 0;
                while (i55 < width) {
                    int i56 = -i16;
                    int i57 = i56 * width;
                    int i58 = 0;
                    int i59 = 0;
                    int i60 = 0;
                    int i61 = 0;
                    int i62 = 0;
                    int i63 = 0;
                    int i64 = 0;
                    int i65 = 0;
                    int i66 = 0;
                    while (i56 <= i16) {
                        int[] iArr14 = iArr7;
                        int max = Math.max(0, i57) + i55;
                        int[] iArr15 = iArr9[i56 + i16];
                        iArr15[0] = iArr4[max];
                        iArr15[1] = iArr5[max];
                        iArr15[2] = iArr6[max];
                        int abs2 = i25 - Math.abs(i56);
                        i59 = (iArr4[max] * abs2) + i59;
                        i58 = (iArr5[max] * abs2) + i58;
                        i60 = (iArr6[max] * abs2) + i60;
                        if (i56 > 0) {
                            i64 += iArr15[0];
                            i65 += iArr15[1];
                            i66 += iArr15[2];
                        } else {
                            i61 += iArr15[0];
                            i62 += iArr15[1];
                            i63 += iArr15[2];
                        }
                        if (i56 < i19) {
                            i57 += width;
                        }
                        i56++;
                        iArr7 = iArr14;
                    }
                    int[] iArr16 = iArr7;
                    int i67 = 0;
                    int i68 = i54;
                    int i69 = i55;
                    int i70 = i16;
                    while (i67 < i68) {
                        iArr3[i69] = (iArr3[i69] & (-16777216)) | (iArr13[i59] << 16) | (iArr13[i58] << 8) | iArr13[i60];
                        int i71 = i59 - i61;
                        int i72 = i58 - i62;
                        int i73 = i60 - i63;
                        int[] iArr17 = iArr9[((i70 - i16) + i20) % i20];
                        int i74 = i61 - iArr17[0];
                        int i75 = i62 - iArr17[1];
                        int i76 = i63 - iArr17[2];
                        int i77 = i16;
                        if (i55 == 0) {
                            iArr16[i67] = Math.min(i67 + i25, i19) * width;
                        }
                        int i78 = iArr16[i67] + i55;
                        iArr17[0] = iArr4[i78];
                        iArr17[1] = iArr5[i78];
                        iArr17[2] = iArr6[i78];
                        int i79 = i64 + iArr17[0];
                        int i80 = i65 + iArr17[1];
                        int i81 = i66 + iArr17[2];
                        i59 = i71 + i79;
                        i58 = i72 + i80;
                        i60 = i73 + i81;
                        i70 = (i70 + 1) % i20;
                        int[] iArr18 = iArr9[i70];
                        i61 = i74 + iArr18[0];
                        i62 = i75 + iArr18[1];
                        i63 = i76 + iArr18[2];
                        i64 = i79 - iArr18[0];
                        i65 = i80 - iArr18[1];
                        i66 = i81 - iArr18[2];
                        i69 += width;
                        i67++;
                        i16 = i77;
                    }
                    i55++;
                    i54 = i68;
                    iArr7 = iArr16;
                }
                bitmap5.setPixels(iArr3, 0, width, 0, 0, width, i54);
                bitmap2 = bitmap5;
            }
            bVar2 = bVar;
            createBitmap = bitmap2;
        }
        if (bVar2.d == 1) {
            return createBitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, bVar2.f11701a, bVar2.f11702b, true);
        createBitmap.recycle();
        return createScaledBitmap;
    }

    public static Bitmap b(View view, b bVar) {
        view.setDrawingCacheEnabled(true);
        view.destroyDrawingCache();
        view.setDrawingCacheQuality(524288);
        Bitmap drawingCache = view.getDrawingCache();
        Bitmap a10 = a(view.getContext(), drawingCache, bVar);
        drawingCache.recycle();
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(android.content.Context r6, android.graphics.Bitmap r7, int r8) {
        /*
            r0 = 23
            r1 = 0
            android.renderscript.RenderScript r6 = android.renderscript.RenderScript.create(r6)     // Catch: java.lang.Throwable -> L56
            android.renderscript.RenderScript$RSMessageHandler r2 = new android.renderscript.RenderScript$RSMessageHandler     // Catch: java.lang.Throwable -> L50
            r2.<init>()     // Catch: java.lang.Throwable -> L50
            r6.setMessageHandler(r2)     // Catch: java.lang.Throwable -> L50
            android.renderscript.Allocation$MipmapControl r2 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L50
            r3 = 1
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createFromBitmap(r6, r7, r2, r3)     // Catch: java.lang.Throwable -> L50
            android.renderscript.Type r3 = r2.getType()     // Catch: java.lang.Throwable -> L4d
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createTyped(r6, r3)     // Catch: java.lang.Throwable -> L4d
            android.renderscript.Element r4 = android.renderscript.Element.U8_4(r6)     // Catch: java.lang.Throwable -> L48
            android.renderscript.ScriptIntrinsicBlur r1 = android.renderscript.ScriptIntrinsicBlur.create(r6, r4)     // Catch: java.lang.Throwable -> L48
            r1.setInput(r2)     // Catch: java.lang.Throwable -> L48
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L48
            r1.setRadius(r8)     // Catch: java.lang.Throwable -> L48
            r1.forEach(r3)     // Catch: java.lang.Throwable -> L48
            r3.copyTo(r7)     // Catch: java.lang.Throwable -> L48
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r0) goto L3b
            android.renderscript.RenderScript.releaseAllContexts()
            goto L3e
        L3b:
            r6.destroy()
        L3e:
            r2.destroy()
            r3.destroy()
            r1.destroy()
            return r7
        L48:
            r7 = move-exception
            r5 = r1
            r1 = r6
            r6 = r5
            goto L5a
        L4d:
            r7 = move-exception
            r3 = r1
            goto L53
        L50:
            r7 = move-exception
            r2 = r1
            r3 = r2
        L53:
            r1 = r6
            r6 = r3
            goto L5a
        L56:
            r7 = move-exception
            r6 = r1
            r2 = r6
            r3 = r2
        L5a:
            if (r1 == 0) goto L67
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r0) goto L64
            android.renderscript.RenderScript.releaseAllContexts()
            goto L67
        L64:
            r1.destroy()
        L67:
            if (r2 == 0) goto L6c
            r2.destroy()
        L6c:
            if (r3 == 0) goto L71
            r3.destroy()
        L71:
            if (r6 == 0) goto L76
            r6.destroy()
        L76:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: je.a.c(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }
}
