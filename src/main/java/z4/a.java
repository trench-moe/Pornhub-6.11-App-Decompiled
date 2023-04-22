package z4;

import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.performerdetails.PerformerActivity;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a extends ClickableSpan {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f21772c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f21773f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f21774j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ String f21775m;
    public final /* synthetic */ b n;

    public a(b bVar, String str, String str2, String str3, String str4) {
        this.n = bVar;
        this.f21772c = str;
        this.f21773f = str2;
        this.f21774j = str3;
        this.f21775m = str4;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        kf.a.f12078a.a("Clicked on embedded url ::::::: %s", this.f21772c);
        if (TextUtils.isEmpty(this.f21773f)) {
            if (TextUtils.isEmpty(this.f21774j)) {
                if (!TextUtils.isEmpty(this.f21775m)) {
                    b bVar = this.n;
                    bVar.I0(PerformerActivity.C(bVar.q(), this.f21775m, PerformersConfig.PerformerType.Pornstar.INSTANCE));
                }
            } else if (!this.n.f21784u0.isEmpty()) {
                for (Category category : this.n.f21784u0) {
                    if (category.getName().equalsIgnoreCase(this.f21774j)) {
                        b bVar2 = this.n;
                        Objects.requireNonNull(bVar2);
                        bVar2.I0(HomeActivity.D(bVar2.u0(), category.getName()));
                        return;
                    }
                }
            }
        } else if (!this.n.f21784u0.isEmpty()) {
            for (Category category2 : this.n.f21784u0) {
                if (category2.getId().equals(this.f21773f)) {
                    b bVar3 = this.n;
                    Objects.requireNonNull(bVar3);
                    bVar3.I0(HomeActivity.D(bVar3.u0(), category2.getName()));
                    return;
                }
            }
        }
    }
}
