package t3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes2.dex */
public class l {
    public static String a(UserMetaData userMetaData) {
        return userMetaData == null ? BuildConfig.FLAVOR : userMetaData.getId();
    }

    public static Intent b(boolean z10) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", "com.appatomic.vpnhub").appendQueryParameter("referrer", "utm_source%3Dphapp%26utm_medium%3Dtoggle").build());
        if (z10) {
            intent.setPackage("com.android.vending");
        }
        return intent;
    }

    public static boolean c(Context context) {
        Object obj = c9.e.f3872c;
        boolean z10 = c9.e.d.c(context, c9.f.f3876a) == 0;
        try {
            v8.b.c(context);
            return z10;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d(UserMetaData userMetaData) {
        return userMetaData.getUsername().equals("Unknown") || userMetaData.getId().equals("50");
    }

    public static void e(Context context, String str, String str2, String str3) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.TEXT", str3);
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(Intent.createChooser(intent, str));
        } else {
            Toast.makeText(context, context.getResources().getString(R.string.resolve_share_activity_not_found), 0).show();
        }
    }

    public static void f(Context context, VideoMetaData videoMetaData) {
        String string = context.getString(R.string.share_video);
        String title = videoMetaData.getTitle();
        StringBuilder m10 = a1.a.m("https://www.pornhub.com/view_video.php?viewkey=");
        m10.append(videoMetaData.getVkey());
        e(context, string, title, m10.toString());
    }
}
