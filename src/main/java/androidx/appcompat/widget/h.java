package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.f0;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f1002b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static h f1003c;

    /* renamed from: a  reason: collision with root package name */
    public f0 f1004a;

    /* loaded from: classes.dex */
    public class a implements f0.f {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f1005a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f1006b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f1007c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        public final int[] d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f1008e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f1009f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public final boolean a(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i10) {
            int c10 = k0.c(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{k0.f1033b, k0.d, k0.f1034c, k0.f1036f}, new int[]{k0.b(context, R.attr.colorButtonNormal), e0.a.f(c10, i10), e0.a.f(c10, i10), i10});
        }

        public final LayerDrawable c(f0 f0Var, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable f10 = f0Var.f(context, R.drawable.abc_star_black_48dp);
            Drawable f11 = f0Var.f(context, R.drawable.abc_star_half_black_48dp);
            if ((f10 instanceof BitmapDrawable) && f10.getIntrinsicWidth() == dimensionPixelSize && f10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) f10;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                f10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f10.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((f11 instanceof BitmapDrawable) && f11.getIntrinsicWidth() == dimensionPixelSize && f11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) f11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                f11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public ColorStateList d(Context context, int i10) {
            if (i10 == R.drawable.abc_edit_text_material) {
                return c0.a.c(context, R.color.abc_tint_edittext);
            }
            if (i10 == R.drawable.abc_switch_track_mtrl_alpha) {
                return c0.a.c(context, R.color.abc_tint_switch_track);
            }
            if (i10 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList d = k0.d(context, R.attr.colorSwitchThumbNormal);
                if (d == null || !d.isStateful()) {
                    iArr[0] = k0.f1033b;
                    iArr2[0] = k0.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = k0.f1035e;
                    iArr2[1] = k0.c(context, R.attr.colorControlActivated);
                    iArr[2] = k0.f1036f;
                    iArr2[2] = k0.c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = k0.f1033b;
                    iArr2[0] = d.getColorForState(iArr[0], 0);
                    iArr[1] = k0.f1035e;
                    iArr2[1] = k0.c(context, R.attr.colorControlActivated);
                    iArr[2] = k0.f1036f;
                    iArr2[2] = d.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i10 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, k0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i10 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i10 == R.drawable.abc_btn_colored_material) {
                    return b(context, k0.c(context, R.attr.colorAccent));
                }
                if (i10 == R.drawable.abc_spinner_mtrl_am_alpha || i10 == R.drawable.abc_spinner_textfield_background_material) {
                    return c0.a.c(context, R.color.abc_tint_spinner);
                }
                if (a(this.f1006b, i10)) {
                    return k0.d(context, R.attr.colorControlNormal);
                }
                if (a(this.f1008e, i10)) {
                    return c0.a.c(context, R.color.abc_tint_default);
                }
                if (a(this.f1009f, i10)) {
                    return c0.a.c(context, R.color.abc_tint_btn_checkable);
                }
                if (i10 == R.drawable.abc_seekbar_thumb_material) {
                    return c0.a.c(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
        }

        public final void e(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (v.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = h.f1002b;
            }
            drawable.setColorFilter(h.c(i10, mode));
        }
    }

    public static synchronized h a() {
        h hVar;
        synchronized (h.class) {
            try {
                if (f1003c == null) {
                    e();
                }
                hVar = f1003c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        synchronized (h.class) {
            h10 = f0.h(i10, mode);
        }
        return h10;
    }

    public static synchronized void e() {
        synchronized (h.class) {
            if (f1003c == null) {
                h hVar = new h();
                f1003c = hVar;
                hVar.f1004a = f0.d();
                f0 f0Var = f1003c.f1004a;
                a aVar = new a();
                synchronized (f0Var) {
                    f0Var.f996g = aVar;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(android.graphics.drawable.Drawable r4, androidx.appcompat.widget.n0 r5, int[] r6) {
        /*
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.f0.f988h
            r3 = 4
            boolean r3 = androidx.appcompat.widget.v.a(r4)
            r0 = r3
            if (r0 == 0) goto L1a
            android.graphics.drawable.Drawable r3 = r4.mutate()
            r0 = r3
            if (r0 == r4) goto L1a
            java.lang.String r4 = "ResourceManagerInternal"
            r3 = 6
            java.lang.String r5 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r4, r5)
            goto L63
        L1a:
            r3 = 3
            boolean r0 = r5.d
            r3 = 2
            if (r0 != 0) goto L2c
            boolean r1 = r5.f1049c
            r3 = 5
            if (r1 == 0) goto L26
            goto L2d
        L26:
            r3 = 5
            r4.clearColorFilter()
            r3 = 5
            goto L58
        L2c:
            r3 = 4
        L2d:
            r1 = 0
            if (r0 == 0) goto L34
            android.content.res.ColorStateList r0 = r5.f1047a
            r3 = 5
            goto L35
        L34:
            r0 = r1
        L35:
            boolean r2 = r5.f1049c
            if (r2 == 0) goto L3d
            r3 = 2
            android.graphics.PorterDuff$Mode r5 = r5.f1048b
            goto L41
        L3d:
            r3 = 5
            android.graphics.PorterDuff$Mode r5 = androidx.appcompat.widget.f0.f988h
            r3 = 1
        L41:
            if (r0 == 0) goto L53
            r3 = 5
            if (r5 != 0) goto L48
            r3 = 5
            goto L54
        L48:
            r3 = 5
            r1 = 0
            int r6 = r0.getColorForState(r6, r1)
            android.graphics.PorterDuffColorFilter r3 = androidx.appcompat.widget.f0.h(r6, r5)
            r1 = r3
        L53:
            r3 = 4
        L54:
            r4.setColorFilter(r1)
            r3 = 7
        L58:
            int r5 = android.os.Build.VERSION.SDK_INT
            r3 = 6
            r3 = 23
            r6 = r3
            if (r5 > r6) goto L63
            r4.invalidateSelf()
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.f(android.graphics.drawable.Drawable, androidx.appcompat.widget.n0, int[]):void");
    }

    public synchronized Drawable b(Context context, int i10) {
        return this.f1004a.f(context, i10);
    }

    public synchronized ColorStateList d(Context context, int i10) {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.f1004a.i(context, i10);
    }
}
