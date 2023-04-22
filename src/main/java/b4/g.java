package b4;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes.dex */
public class g extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public Context f3568a;

    /* renamed from: b  reason: collision with root package name */
    public w3.b f3569b;

    public g(Context context, w3.b bVar) {
        this.f3568a = context;
        this.f3569b = bVar;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        w3.a aVar = (w3.a) this.f3569b;
        aVar.f16373p0.setVisibility(0);
        aVar.f16372o0.setVisibility(8);
        aVar.f16372o0.loadData(BuildConfig.FLAVOR, "text/html", "utf-8");
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f3568a != null) {
            if (!str.startsWith("market://") && !str.startsWith("https://market.android.com/")) {
                if (!str.startsWith("https://play.google.com/store/apps/")) {
                    if (!str.startsWith("tel://")) {
                        if (str.startsWith("tel:")) {
                        }
                    }
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(str.replace("tel://", "tel:")));
                    intent.setFlags(268435456);
                    this.f3568a.startActivity(intent);
                    return true;
                }
            }
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str.replace("https://market.android.com/", "market://").replace("https://play.google.com/store/apps/", "market://").replace("market://search?q=pname:", "market://details?id=")));
            intent2.setFlags(268435456);
            this.f3568a.startActivity(intent2);
            return true;
        }
        if (str.contains("approved.php") && str.contains("memberid")) {
            str.contains("natssess");
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
