package o9;

import android.os.Looper;
import android.util.Log;
import com.app.pornhub.R;
import com.google.android.gms.internal.cast.zzoe;
import ea.j;
import t9.o1;
import t9.q1;

/* loaded from: classes2.dex */
public class b implements o1, q1, ea.f {

    /* renamed from: c  reason: collision with root package name */
    public static volatile ClassLoader f13620c;

    /* renamed from: f  reason: collision with root package name */
    public static volatile Thread f13621f;

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f13622j = {R.attr.resize_mode};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f13623m = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.bar_gravity, R.attr.bar_height, R.attr.buffered_color, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.touch_target_height, R.attr.unplayed_color};
    public static final int[] n = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.bar_gravity, R.attr.bar_height, R.attr.buffered_color, R.attr.controller_layout_id, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.repeat_toggle_modes, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.show_fastforward_button, R.attr.show_next_button, R.attr.show_previous_button, R.attr.show_rewind_button, R.attr.show_shuffle_button, R.attr.show_timeout, R.attr.time_bar_min_update_interval, R.attr.touch_target_height, R.attr.unplayed_color};

    /* renamed from: t  reason: collision with root package name */
    public static final int[] f13624t = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.auto_show, R.attr.bar_height, R.attr.buffered_color, R.attr.controller_layout_id, R.attr.default_artwork, R.attr.hide_during_ads, R.attr.hide_on_touch, R.attr.keep_content_on_player_reset, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.player_layout_id, R.attr.repeat_toggle_modes, R.attr.resize_mode, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.show_buffering, R.attr.show_shuffle_button, R.attr.show_timeout, R.attr.shutter_background_color, R.attr.surface_type, R.attr.time_bar_min_update_interval, R.attr.touch_target_height, R.attr.unplayed_color, R.attr.use_artwork, R.attr.use_controller};

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f13625u = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.animation_enabled, R.attr.bar_gravity, R.attr.bar_height, R.attr.buffered_color, R.attr.controller_layout_id, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.repeat_toggle_modes, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.show_fastforward_button, R.attr.show_next_button, R.attr.show_previous_button, R.attr.show_rewind_button, R.attr.show_shuffle_button, R.attr.show_subtitle_button, R.attr.show_timeout, R.attr.show_vr_button, R.attr.time_bar_min_update_interval, R.attr.touch_target_height, R.attr.unplayed_color};

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f13626w = {R.attr.ad_marker_color, R.attr.ad_marker_width, R.attr.animation_enabled, R.attr.auto_show, R.attr.bar_gravity, R.attr.bar_height, R.attr.buffered_color, R.attr.controller_layout_id, R.attr.default_artwork, R.attr.hide_during_ads, R.attr.hide_on_touch, R.attr.keep_content_on_player_reset, R.attr.played_ad_marker_color, R.attr.played_color, R.attr.player_layout_id, R.attr.repeat_toggle_modes, R.attr.resize_mode, R.attr.scrubber_color, R.attr.scrubber_disabled_size, R.attr.scrubber_dragged_size, R.attr.scrubber_drawable, R.attr.scrubber_enabled_size, R.attr.show_buffering, R.attr.show_shuffle_button, R.attr.show_subtitle_button, R.attr.show_timeout, R.attr.show_vr_button, R.attr.shutter_background_color, R.attr.surface_type, R.attr.time_bar_min_update_interval, R.attr.touch_target_height, R.attr.unplayed_color, R.attr.use_artwork, R.attr.use_controller};
    public static final int[] y = {16843071, 16843072, R.attr.externalRouteEnabledDrawable, R.attr.externalRouteEnabledDrawableStatic, R.attr.mediaRouteButtonTint};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f13627z = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};
    public static final o1 A = new b();
    public static final o1 B = new b();
    public static final int[] C = {R.attr.keylines, R.attr.statusBarBackground};
    public static final int[] D = {16842931, R.attr.layout_anchor, R.attr.layout_anchorGravity, R.attr.layout_behavior, R.attr.layout_dodgeInsetEdges, R.attr.layout_insetEdge, R.attr.layout_keyline};

    public /* synthetic */ b() {
    }

    public /* synthetic */ b(Object obj) {
    }

    public static synchronized ClassLoader b() {
        ClassLoader classLoader;
        synchronized (b.class) {
            try {
                if (f13620c == null) {
                    f13620c = e();
                }
                classLoader = f13620c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return classLoader;
    }

    public static String c(zzoe zzoeVar) {
        StringBuilder sb2 = new StringBuilder(zzoeVar.g());
        for (int i10 = 0; i10 < zzoeVar.g(); i10++) {
            byte b10 = zzoeVar.b(i10);
            if (b10 == 34) {
                sb2.append("\\\"");
            } else if (b10 == 39) {
                sb2.append("\\'");
            } else if (b10 != 92) {
                switch (b10) {
                    case 7:
                        sb2.append("\\a");
                        continue;
                    case 8:
                        sb2.append("\\b");
                        continue;
                    case 9:
                        sb2.append("\\t");
                        continue;
                    case 10:
                        sb2.append("\\n");
                        continue;
                    case 11:
                        sb2.append("\\v");
                        continue;
                    case 12:
                        sb2.append("\\f");
                        continue;
                    case 13:
                        sb2.append("\\r");
                        continue;
                    default:
                        if (b10 < 32 || b10 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((b10 >>> 6) & 3) + 48));
                            sb2.append((char) (((b10 >>> 3) & 7) + 48));
                            sb2.append((char) ((b10 & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) b10);
                            continue;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static synchronized ClassLoader e() {
        synchronized (b.class) {
            ClassLoader classLoader = null;
            if (f13621f == null) {
                f13621f = g();
                if (f13621f == null) {
                    return null;
                }
            }
            synchronized (f13621f) {
                try {
                    classLoader = f13621f.getContextClassLoader();
                } catch (SecurityException e10) {
                    String valueOf = String.valueOf(e10.getMessage());
                    Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new String("Failed to get thread context classloader "));
                }
            }
            return classLoader;
        }
    }

    public static synchronized Thread g() {
        SecurityException e10;
        a aVar;
        a aVar2;
        ThreadGroup threadGroup;
        synchronized (b.class) {
            try {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    return null;
                }
                synchronized (Void.class) {
                    try {
                        int activeGroupCount = threadGroup2.activeGroupCount();
                        ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                        threadGroup2.enumerate(threadGroupArr);
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= activeGroupCount) {
                                threadGroup = null;
                                break;
                            }
                            threadGroup = threadGroupArr[i11];
                            if ("dynamiteLoader".equals(threadGroup.getName())) {
                                break;
                            }
                            i11++;
                        }
                        if (threadGroup == null) {
                            threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                        }
                        int activeCount = threadGroup.activeCount();
                        Thread[] threadArr = new Thread[activeCount];
                        threadGroup.enumerate(threadArr);
                        while (true) {
                            if (i10 >= activeCount) {
                                aVar2 = null;
                                break;
                            }
                            aVar2 = threadArr[i10];
                            if ("GmsDynamite".equals(aVar2.getName())) {
                                break;
                            }
                            i10++;
                        }
                    } catch (SecurityException e11) {
                        e10 = e11;
                        aVar = null;
                    }
                    if (aVar2 == null) {
                        try {
                            aVar = new a(threadGroup);
                        } catch (SecurityException e12) {
                            e10 = e12;
                            aVar = aVar2;
                        }
                        try {
                            aVar.setContextClassLoader(null);
                            aVar.start();
                        } catch (SecurityException e13) {
                            e10 = e13;
                            String valueOf = String.valueOf(e10.getMessage());
                            Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to enumerate thread/threadgroup ".concat(valueOf) : new String("Failed to enumerate thread/threadgroup "));
                            aVar2 = aVar;
                            return aVar2;
                        }
                        aVar2 = aVar;
                    }
                }
                return aVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ea.f
    public ea.g a(Object obj) {
        Void r52 = (Void) obj;
        return j.d(Boolean.TRUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean f(byte[] r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 169
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.b.f(byte[], int, int):boolean");
    }
}
