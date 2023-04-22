package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f1816k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f1817a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1818b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1819c;
    public Parcelable d;

    /* renamed from: e  reason: collision with root package name */
    public int f1820e;

    /* renamed from: f  reason: collision with root package name */
    public int f1821f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1822g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1823h;

    /* renamed from: i  reason: collision with root package name */
    public String f1824i;

    /* renamed from: j  reason: collision with root package name */
    public String f1825j;

    public IconCompat() {
        this.f1817a = -1;
        this.f1819c = null;
        this.d = null;
        this.f1820e = 0;
        this.f1821f = 0;
        this.f1822g = null;
        this.f1823h = f1816k;
        this.f1824i = null;
    }

    public IconCompat(int i10) {
        this.f1817a = -1;
        this.f1819c = null;
        this.d = null;
        this.f1820e = 0;
        this.f1821f = 0;
        this.f1822g = null;
        this.f1823h = f1816k;
        this.f1824i = null;
        this.f1817a = i10;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i10) {
        if (str != null) {
            if (i10 != 0) {
                IconCompat iconCompat = new IconCompat(2);
                iconCompat.f1820e = i10;
                if (resources != null) {
                    try {
                        iconCompat.f1818b = resources.getResourceName(i10);
                    } catch (Resources.NotFoundException unused) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                } else {
                    iconCompat.f1818b = str;
                }
                iconCompat.f1825j = str;
                return iconCompat;
            }
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    public int c() {
        int i10;
        int i11 = this.f1817a;
        if (i11 != -1 || (i10 = Build.VERSION.SDK_INT) < 23) {
            if (i11 == 2) {
                return this.f1820e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        Icon icon = (Icon) this.f1818b;
        if (i10 >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    public String d() {
        int i10;
        int i11 = this.f1817a;
        if (i11 != -1 || (i10 = Build.VERSION.SDK_INT) < 23) {
            if (i11 == 2) {
                return TextUtils.isEmpty(this.f1825j) ? ((String) this.f1818b).split(":", -1)[0] : this.f1825j;
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        Icon icon = (Icon) this.f1818b;
        if (i10 >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon package", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon package", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon package", e12);
            return null;
        }
    }

    public Uri e() {
        int i10;
        int i11 = this.f1817a;
        if (i11 != -1 || (i10 = Build.VERSION.SDK_INT) < 23) {
            if (i11 != 4 && i11 != 6) {
                throw new IllegalStateException("called getUri() on " + this);
            }
            return Uri.parse((String) this.f1818b);
        }
        Icon icon = (Icon) this.f1818b;
        if (i10 >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    public InputStream f(Context context) {
        Uri e10 = e();
        String scheme = e10.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f1818b));
            } catch (FileNotFoundException e11) {
                Log.w("IconCompat", "Unable to load image from path: " + e10, e11);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(e10);
        } catch (Exception e12) {
            Log.w("IconCompat", "Unable to load image from URI: " + e10, e12);
            return null;
        }
    }

    @Deprecated
    public Icon g() {
        return h(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.drawable.Icon h(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.h(android.content.Context):android.graphics.drawable.Icon");
    }

    public String toString() {
        String str;
        if (this.f1817a == -1) {
            return String.valueOf(this.f1818b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1817a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1817a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1818b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1818b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1825j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1820e);
                if (this.f1821f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f1821f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1818b);
                break;
        }
        if (this.f1822g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1822g);
        }
        if (this.f1823h != f1816k) {
            sb2.append(" mode=");
            sb2.append(this.f1823h);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
