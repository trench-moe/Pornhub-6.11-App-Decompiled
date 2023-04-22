package dd;

import android.view.View;
import com.mixpanel.android.mpmetrics.s;

/* loaded from: classes.dex */
public class a implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f8909c;

    public a(d dVar) {
        this.f8909c = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f8909c.finish();
        s.d(this.f8909c.f8919j);
    }
}
