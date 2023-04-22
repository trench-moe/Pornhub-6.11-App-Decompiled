package t3;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.domain.error.MalformedDataException;
import com.app.pornhub.domain.error.NetworkException;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.video.VideoContentType;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f15126a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f15127b = {R.drawable.babes_logo, R.drawable.bangbros_logo, R.drawable.blacked_logo, R.drawable.bratty_sis_logo, R.drawable.brazzers_logo, R.drawable.combat_zone_logo, R.drawable.ddf_logo, R.drawable.exposed_whores_logo, R.drawable.exxxtrasmall_logo, R.drawable.fakehub_logo, R.drawable.familystrokes_logo, R.drawable.girlsdoporn_logo, R.drawable.glory_hole_logo, R.drawable.hookuphotshot_logo, R.drawable.jays_logo, R.drawable.jm_elite, R.drawable.julesjordan_logo, R.drawable.lethalhardcore_logo, R.drawable.mompov_logo, R.drawable.momsbangteens_logo, R.drawable.momsteachsex_white_logo, R.drawable.mypervyfamily_logo, R.drawable.newsensations_white_logo, R.drawable.nubilefilms_logo, R.drawable.pornfidelity_white_logo, R.drawable.prpertysex_logo, R.drawable.sislovesme_logo, R.drawable.stepsiblings_logo, R.drawable.teamskeet_logo, R.drawable.teencreamery_logo, R.drawable.teenfidelity_white_logo, R.drawable.tushy_logo, R.drawable.wickedpictures_white_logo};

    /* renamed from: c  reason: collision with root package name */
    public static final List<Integer> f15128c = CollectionsKt.listOf((Object[]) new Integer[]{104, 114, 105, 108, 110, 109});

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoContentType.values().length];
            iArr[VideoContentType.FREE.ordinal()] = 1;
            iArr[VideoContentType.FREE_PREMIUM.ordinal()] = 2;
            iArr[VideoContentType.PREMIUM.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(VideoContentType videoContentType, ImageView imageView, int i10, int i11) {
        int i12 = a.$EnumSwitchMapping$0[videoContentType.ordinal()];
        if (i12 == 1) {
            imageView.setVisibility(8);
        } else if (i12 == 2) {
            imageView.setVisibility(0);
            imageView.setImageResource(i11);
        } else if (i12 != 3) {
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(i10);
        }
    }

    @JvmStatic
    public static final void b(VideoContentType type, ImageView target) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(target, "target");
        a(type, target, R.drawable.ic_premium_video_item, R.drawable.ic_premium_free_video_item);
    }

    @JvmStatic
    public static final boolean c(RecyclerView.Adapter<? extends RecyclerView.z> adapter, int i10) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (i10 != 0 && i10 >= adapter.a()) {
            return false;
        }
        return true;
    }

    @JvmStatic
    public static final void d(PopupWindow popupWindow) {
        if (popupWindow != null && popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
    }

    @JvmStatic
    public static final String e(int i10) {
        int i11 = i10 / 1000;
        int i12 = i11 / 3600;
        int i13 = i11 % 3600;
        int i14 = i13 / 60;
        int i15 = i13 % 60;
        if (i12 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i12), Integer.valueOf(i14), Integer.valueOf(i15)}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            return format;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i14), Integer.valueOf(i15)}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
        return format2;
    }

    @JvmStatic
    public static final String f(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (i10 == 43) {
            String string = context.getString(R.string.error_invalid_credentials);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rror_invalid_credentials)");
            return string;
        }
        if (i10 != 45) {
            if (i10 == 55) {
                String string2 = context.getString(R.string.error_default);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.error_default)");
                return string2;
            } else if (i10 != 65 && i10 != 74) {
                if (i10 == 97) {
                    String string3 = context.getString(R.string.error_account_locked_too_many_attempts);
                    Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…locked_too_many_attempts)");
                    return string3;
                } else if (i10 == 102) {
                    String string4 = context.getString(R.string.error_invalid_verification_code);
                    Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…nvalid_verification_code)");
                    return string4;
                } else if (i10 == 103) {
                    String string5 = context.getString(R.string.error_captcha_failed);
                    Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.string.error_captcha_failed)");
                    return string5;
                } else if (i10 == 116) {
                    String string6 = context.getString(R.string.error_network);
                    Intrinsics.checkNotNullExpressionValue(string6, "context.getString(R.string.error_network)");
                    return string6;
                } else if (i10 == 117) {
                    String string7 = context.getString(R.string.error_model_cp_not_able_to_login);
                    Intrinsics.checkNotNullExpressionValue(string7, "context.getString(R.stri…del_cp_not_able_to_login)");
                    return string7;
                } else {
                    switch (i10) {
                        case 111:
                            String string8 = context.getString(R.string.error_email_taken);
                            Intrinsics.checkNotNullExpressionValue(string8, "context.getString(R.string.error_email_taken)");
                            return string8;
                        case 112:
                            String string9 = context.getString(R.string.error_username_taken);
                            Intrinsics.checkNotNullExpressionValue(string9, "context.getString(R.string.error_username_taken)");
                            return string9;
                        case 113:
                            String string10 = context.getString(R.string.error_password_format);
                            Intrinsics.checkNotNullExpressionValue(string10, "context.getString(R.string.error_password_format)");
                            return string10;
                        default:
                            String string11 = context.getString(R.string.error_default);
                            Intrinsics.checkNotNullExpressionValue(string11, "context.getString(R.string.error_default)");
                            return string11;
                    }
                }
            }
        }
        String string12 = context.getString(R.string.error_account_locked);
        Intrinsics.checkNotNullExpressionValue(string12, "context.getString(R.string.error_account_locked)");
        return string12;
    }

    @JvmStatic
    public static final int g(boolean z10) {
        return z10 ? R.drawable.men : R.drawable.girls;
    }

    @JvmStatic
    public static final String h(Context context, Throwable th) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (th instanceof NetworkException) {
            String string = context.getString(R.string.error_network);
            Intrinsics.checkNotNullExpressionValue(string, "{\n                contex…or_network)\n            }");
            return string;
        } else if (th instanceof PornhubException) {
            String string2 = context.getString(R.string.error_api, Integer.valueOf(((PornhubException) th).a()));
            Intrinsics.checkNotNullExpressionValue(string2, "{\n                contex…          )\n            }");
            return string2;
        } else if (th instanceof MalformedDataException) {
            String string3 = context.getString(R.string.error_malformed_data);
            Intrinsics.checkNotNullExpressionValue(string3, "{\n                contex…ormed_data)\n            }");
            return string3;
        } else {
            String string4 = context.getString(R.string.error_default);
            Intrinsics.checkNotNullExpressionValue(string4, "{\n                contex…or_default)\n            }");
            return string4;
        }
    }

    @JvmStatic
    public static final Drawable i(Resources resources, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        f0.b bVar = new f0.b(resources, bitmap);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(resources, bitmap)");
        bVar.f9340k = true;
        bVar.f9339j = true;
        bVar.f9336g = Math.min(bVar.f9342m, bVar.f9341l) / 2;
        bVar.d.setShader(bVar.f9334e);
        bVar.invalidateSelf();
        bVar.b(Math.max(bitmap.getWidth(), bitmap.getHeight()) / 2.0f);
        return bVar;
    }

    @JvmStatic
    public static final String j(Bundle bundle, String str) {
        String string = bundle.getString(str, BuildConfig.FLAVOR);
        return string == null ? BuildConfig.FLAVOR : string;
    }

    public static final String k(Context context, VideoMetaData videoMetaData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoMetaData, "videoMetaData");
        if (videoMetaData.isVr()) {
            String string = context.getString(R.string.vr);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.vr)");
            return string;
        } else if (videoMetaData.isHd()) {
            String string2 = context.getString(R.string.f21944hd);
            Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.hd)");
            return string2;
        } else {
            return BuildConfig.FLAVOR;
        }
    }

    @JvmStatic
    public static final boolean l(int i10) {
        return f15128c.contains(Integer.valueOf(i10));
    }

    @JvmStatic
    public static final void m(int i10, int i11, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        int paddingTop = recyclerView.getPaddingTop();
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        if (paddingTop < i10) {
            recyclerView.j0(0, -(i11 - paddingTop));
            return;
        }
        if (paddingTop > i10 && i11 != 0 && i11 < i10) {
            recyclerView.j0(0, i11);
        }
    }

    @JvmStatic
    public static final void n(Context context, String str) {
        new AlertDialog.Builder(context).setTitle(R.string.error).setMessage(str).setPositiveButton(R.string.ok, n.f15122f).create().show();
    }

    @JvmStatic
    public static final void o(VideoMetaData videoMetaData, ImageView iconView) {
        Intrinsics.checkNotNullParameter(videoMetaData, "videoMetaData");
        Intrinsics.checkNotNullParameter(iconView, "iconView");
        boolean z10 = true;
        boolean z11 = videoMetaData.isVerified() && !videoMetaData.isContentPartner();
        if (videoMetaData.isVerified() || !videoMetaData.isContentPartner()) {
            z10 = false;
        }
        if (z11) {
            iconView.setVisibility(0);
            iconView.setImageResource(R.drawable.ic_blue_checkmark);
        } else if (!z10) {
            iconView.setVisibility(8);
        } else {
            iconView.setVisibility(0);
            iconView.setImageResource(R.drawable.ic_tv);
        }
    }
}
