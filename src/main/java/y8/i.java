package y8;

import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes2.dex */
public final class i implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f18559c;

    public i(b bVar) {
        this.f18559c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f18559c;
        w8.a aVar = v8.b.c(bVar.f18547c).a().f16074t;
        if (aVar != null) {
            if (TextUtils.isEmpty(aVar.f16949f)) {
                return;
            }
            ComponentName componentName = new ComponentName(bVar.f18547c.getApplicationContext(), aVar.f16949f);
            Intent intent = new Intent();
            intent.setComponent(componentName);
            bVar.f18547c.startActivity(intent);
        }
    }
}
