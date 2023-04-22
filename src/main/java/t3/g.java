package t3;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.app.pornhub.domain.config.VideoQuality;
import com.app.pornhub.domain.model.explore.ExploreType;
import com.appsflyer.oaid.BuildConfig;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import w9.a2;
import w9.d1;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a */
    public static final g f15112a = new g();

    @JvmStatic
    public static final String a(VideoQuality videoQuality) {
        Intrinsics.checkNotNullParameter(videoQuality, "videoQuality");
        return videoQuality instanceof VideoQuality.Q480p ? "480p" : videoQuality instanceof VideoQuality.Q720p ? "720p" : videoQuality instanceof VideoQuality.Q1080p ? "1080p" : videoQuality instanceof VideoQuality.Q1440p ? "1440p" : videoQuality instanceof VideoQuality.Q2160p ? "2160p" : BuildConfig.FLAVOR;
    }

    @JvmStatic
    public static final void b(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        a2 a2Var = FirebaseAnalytics.getInstance(context).f7990a;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new d1(a2Var, str, 0));
    }

    @JvmStatic
    public static final void c(Context context, String propertyName, String value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        Intrinsics.checkNotNullParameter(value, "value");
        FirebaseAnalytics.getInstance(context).f7990a.c(null, propertyName, value, false);
    }

    @JvmStatic
    public static final void e(Context context, boolean z10, Long l10, Integer num, Long l11, String adUrl) {
        Intrinsics.checkNotNullParameter(adUrl, "adUrl");
        if (context == null) {
            return;
        }
        g(context, "phapp_ad_click", z10, l10, num, l11, adUrl);
    }

    @JvmStatic
    public static final void f(Context context, boolean z10, Long l10, Integer num, Long l11, String adUrl) {
        Intrinsics.checkNotNullParameter(adUrl, "adUrl");
        if (context == null) {
            return;
        }
        g(context, "phapp_ad_close", z10, l10, num, l11, adUrl);
    }

    @JvmStatic
    public static final void g(Context context, String str, boolean z10, Long l10, Integer num, Long l11, String str2) {
        Bundle b10 = android.support.v4.media.b.b("ad_url", str2);
        b10.putString("ad_screen_name", z10 ? "video_details" : "video_listings");
        b10.putString("ad_campaign_type", z10 ? "traffic_junkie" : "promo_banner");
        if (z10) {
            b10.putString("ad_id", String.valueOf(l10));
            b10.putString("member_id", String.valueOf(num));
            b10.putString("campaign_id", String.valueOf(l11));
        }
        Unit unit = Unit.INSTANCE;
        i(context, str, b10);
    }

    @JvmStatic
    public static final void h(Context context, boolean z10, Long l10, Integer num, Long l11, String adUrl) {
        Intrinsics.checkNotNullParameter(adUrl, "adUrl");
        if (context == null) {
            return;
        }
        g(context, "phapp_ad_view", z10, l10, num, l11, adUrl);
    }

    @JvmStatic
    public static final void i(Context context, String eventName, Bundle bundle) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (context == null) {
            return;
        }
        FirebaseAnalytics.getInstance(context).a(eventName, bundle);
    }

    @JvmStatic
    public static final void k(Context context, String buttonLocation) {
        Intrinsics.checkNotNullParameter(buttonLocation, "buttonLocation");
        if (context == null) {
            return;
        }
        Bundle b10 = android.support.v4.media.b.b("button_location", buttonLocation);
        Unit unit = Unit.INSTANCE;
        i(context, "phapp_click_join_premium", b10);
    }

    @JvmStatic
    public static final void l(Context context, String itemName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Bundle bundle = new Bundle();
        bundle.putString("menu_item_name", itemName);
        Unit unit = Unit.INSTANCE;
        i(context, "phapp_menu_click", bundle);
    }

    @JvmStatic
    public static final void m(Context context, String keyword, String screenName) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(screenName, "screenName");
        if (context != null) {
            Bundle b10 = android.support.v4.media.b.b("search_keyword", keyword);
            b10.putInt("search_keyword_length", keyword.length());
            b10.putString("search_screen_name", screenName);
            Unit unit = Unit.INSTANCE;
            i(context, "phapp_search_submit", b10);
        }
    }

    @JvmStatic
    public static final void n(Context context, String str, String str2, String str3) {
        Bundle b10 = android.support.v4.media.b.b(str2, str3);
        Unit unit = Unit.INSTANCE;
        i(context, str, b10);
    }

    @JvmStatic
    public static final void o(Context context, String eventName, String str, String tabName, Integer num) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        if (context == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("video_vkey", str);
        bundle.putString("video_details_tab_name", tabName);
        if (num != null) {
            bundle.putInt("items_scrolled_count", num.intValue());
        }
        Unit unit = Unit.INSTANCE;
        i(context, eventName, bundle);
    }

    @JvmStatic
    public static final void p(Context context, String str, String str2, boolean z10, String str3, String str4, String str5, String str6, Boolean bool, Integer num, Long l10, String str7) {
        if (context == null) {
            return;
        }
        Bundle b10 = android.support.v4.media.b.b("video_vkey", str2);
        b10.putString("video_vr_mode", String.valueOf(z10));
        b10.putString("video_uploader", str3);
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = str4.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        b10.putString("video_premium", StringsKt.replace$default(lowerCase, "_", " ", false, 4, (Object) null));
        b10.putString("video_category_ids", str5);
        if (str6 != null) {
            b10.putString("video_quality", str6);
        }
        if (bool != null) {
            b10.putString("video_full_screen", String.valueOf(bool.booleanValue()));
        }
        if (num != null) {
            b10.putInt("video_duration", num.intValue());
        }
        if (l10 != null) {
            b10.putLong("video_watch_time", l10.longValue());
        }
        if (str7 != null) {
            b10.putString("video_filter", str7);
        }
        Unit unit = Unit.INSTANCE;
        i(context, str, b10);
    }

    public static /* synthetic */ void q(Context context, String str, String str2, boolean z10, String str3, String str4, String str5, String str6, Boolean bool, Integer num, Long l10, String str7, int i10) {
        p(context, str, str2, z10, str3, str4, str5, (i10 & 128) != 0 ? null : str6, (i10 & 256) != 0 ? null : bool, (i10 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : num, null, null);
    }

    public final void d(Context context, String str, String str2) {
        String lowerCase;
        if (TextUtils.isEmpty(str2)) {
            lowerCase = "all";
        } else {
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            lowerCase = str2.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        }
        c(context, str, lowerCase);
    }

    public final void j(Context context, ExploreType exploreType, String itemId, String sectionTitle) {
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exploreType, "exploreType");
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        Bundle bundle = new Bundle();
        if (exploreType instanceof ExploreType.Album) {
            str = "Album";
        } else if (exploreType instanceof ExploreType.Category) {
            str = "Category";
        } else if (exploreType instanceof ExploreType.Gif) {
            str = "Gif";
        } else if (exploreType instanceof ExploreType.Performer) {
            str = "Pornstar";
        } else if (exploreType instanceof ExploreType.Video) {
            str = "Video";
        } else if (!(exploreType instanceof ExploreType.Channel)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "Channel";
        }
        bundle.putString("explore_item_type", str);
        bundle.putString("explore_item_id", itemId);
        if (sectionTitle.length() > 0) {
            bundle.putString("explore_section_title", sectionTitle);
        }
        Unit unit = Unit.INSTANCE;
        i(context, "phapp_explore_click", bundle);
    }
}
