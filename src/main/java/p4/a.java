package p4;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.app.pornhub.service.VideoDlService;
import io.realm.Case;
import io.realm.RealmQuery;
import io.realm.p;
import io.realm.v;
import java.util.Objects;
import x4.k;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f13789c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f13790f;

    public /* synthetic */ a(Fragment fragment, int i10) {
        this.f13789c = i10;
        this.f13790f = fragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f13789c) {
            case 0:
                d dVar = (d) this.f13790f;
                String str = d.G0;
                Objects.requireNonNull(dVar);
                Intent intent = new Intent();
                intent.putExtra("selection", dVar.E0);
                intent.putExtra("reason", dVar.F0.getText().toString());
                if (dVar.J() != null) {
                    dVar.J().Q(dVar.f2021z, 1634, intent);
                    return;
                }
                return;
            case 1:
                com.app.pornhub.view.launch.a aVar = (com.app.pornhub.view.launch.a) this.f13790f;
                int i11 = com.app.pornhub.view.launch.a.f5378x0;
                Objects.requireNonNull(aVar);
                dialogInterface.dismiss();
                aVar.r0(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 101);
                return;
            case 2:
                x4.b bVar = (x4.b) this.f13790f;
                String str2 = x4.b.D0;
                String string = bVar.f2019u.getString("payload");
                if (!TextUtils.isEmpty(string)) {
                    p t2 = p.t();
                    t2.e();
                    RealmQuery realmQuery = new RealmQuery(t2, r3.d.class);
                    Case r22 = Case.SENSITIVE;
                    realmQuery.f10812a.e();
                    realmQuery.c("vkey", string, r22);
                    r3.d dVar2 = (r3.d) realmQuery.e();
                    if (dVar2 != null && v.w(dVar2)) {
                        String b10 = dVar2.b();
                        Objects.requireNonNull(b10);
                        char c10 = 65535;
                        switch (b10.hashCode()) {
                            case -1380616235:
                                if (b10.equals("broken")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -1211129254:
                                if (b10.equals("downloading")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case -948696717:
                                if (b10.equals("queued")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case -673660814:
                                if (b10.equals("finished")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 3:
                                a0.b.G(bVar.q(), dVar2.p()).delete();
                                t2.a();
                                dVar2.u();
                                t2.f();
                                break;
                            case 1:
                                o n = bVar.n();
                                Context q10 = bVar.q();
                                int i12 = VideoDlService.C;
                                Intent intent2 = new Intent(q10, VideoDlService.class);
                                intent2.setAction("cancel");
                                n.startService(intent2);
                                break;
                            case 2:
                                o n10 = bVar.n();
                                Context q11 = bVar.q();
                                String p10 = dVar2.p();
                                int i13 = VideoDlService.C;
                                Intent intent3 = new Intent(q11, VideoDlService.class);
                                intent3.setAction("cancel_queued");
                                intent3.putExtra("vkey", p10);
                                n10.startService(intent3);
                                break;
                        }
                    }
                    t2.close();
                }
                bVar.L0(false, false);
                return;
            default:
                k kVar = (k) this.f13790f;
                String str3 = k.D0;
                Objects.requireNonNull(kVar);
                Intent intent4 = new Intent();
                if (kVar.f2019u.containsKey("payload")) {
                    intent4.putExtra("payload", kVar.f2019u.getString("payload"));
                }
                kVar.J().Q(kVar.f2021z, 100, intent4);
                kVar.L0(false, false);
                return;
        }
    }
}
