package x4;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.o;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.e0;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentOfflineVideosBinding;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.service.VideoDlService;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.google.android.material.snackbar.Snackbar;
import io.realm.Case;
import io.realm.RealmQuery;
import io.realm.Sort;
import io.realm.a0;
import io.realm.internal.ObservableCollection;
import io.realm.internal.OsResults;
import io.realm.internal.core.QueryDescriptor;
import io.realm.m;
import io.realm.p;
import io.realm.r;
import io.realm.y;
import java.util.HashSet;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import x4.i;

/* loaded from: classes2.dex */
public class e extends v3.c {
    public static final String A0 = e.class.getSimpleName();

    /* renamed from: p0  reason: collision with root package name */
    public f3.h f17922p0;

    /* renamed from: q0  reason: collision with root package name */
    public q3.a f17923q0;

    /* renamed from: r0  reason: collision with root package name */
    public q3.d f17924r0;

    /* renamed from: s0  reason: collision with root package name */
    public i f17925s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f17926t0;

    /* renamed from: u0  reason: collision with root package name */
    public p f17927u0;

    /* renamed from: v0  reason: collision with root package name */
    public y<r3.d> f17928v0;
    public y<r3.d> w0;

    /* renamed from: x0  reason: collision with root package name */
    public FragmentOfflineVideosBinding f17929x0;

    /* renamed from: y0  reason: collision with root package name */
    public HomeActivityViewModel f17930y0;

    /* renamed from: z0  reason: collision with root package name */
    public i.c f17931z0;

    public e() {
        super(R.layout.fragment_offline_videos);
        this.f17931z0 = new g4.f(this, 2);
    }

    @Override // androidx.fragment.app.Fragment
    public void Q(int i10, int i11, Intent intent) {
        if (i11 == 100) {
            if (i10 != 11) {
                return;
            }
            HashSet<String> hashSet = this.f17925s0.f17937j;
            if (hashSet != null && !hashSet.isEmpty()) {
                p pVar = this.f17927u0;
                RealmQuery h10 = a0.a.h(pVar, pVar, r3.d.class);
                String[] strArr = (String[]) hashSet.toArray(new String[hashSet.size()]);
                Case r10 = Case.SENSITIVE;
                h10.f10812a.e();
                if (strArr == null || strArr.length == 0) {
                    h10.f10812a.e();
                    h10.f10813b.a();
                } else {
                    h10.f10813b.e();
                    h10.c("vkey", strArr[0], r10);
                    for (int i12 = 1; i12 < strArr.length; i12++) {
                        h10.f10813b.g();
                        h10.c("vkey", strArr[i12], r10);
                    }
                    h10.f10813b.b();
                }
                m.a aVar = new m.a();
                while (aVar.hasNext()) {
                    r3.d dVar = (r3.d) aVar.next();
                    if (dVar.x()) {
                        a0.b.G(q(), dVar.p()).delete();
                        this.f17927u0.a();
                        dVar.u();
                        this.f17927u0.f();
                    } else {
                        o n = n();
                        Context q10 = q();
                        String p10 = dVar.p();
                        int i13 = VideoDlService.C;
                        Intent intent2 = new Intent(q10, VideoDlService.class);
                        intent2.setAction("cancel_unknown_status");
                        intent2.putExtra("vkey", p10);
                        n.startService(intent2);
                    }
                }
            }
            v3.b bVar = (v3.b) n();
            j.a aVar2 = bVar.J;
            if (aVar2 != null) {
                Intrinsics.checkNotNull(aVar2);
                aVar2.c();
                bVar.J = null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        if (!this.S) {
            this.S = true;
            if (L() && !this.P) {
                this.J.x();
            }
        }
        if (s0() instanceof HomeActivity) {
            this.f17930y0 = (HomeActivityViewModel) new z(s0(), this.f16000o0).a(HomeActivityViewModel.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void V(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.menu_offline_videos, menu);
        menu.findItem(R.id.restart_downloads).setVisible(this.f17926t0);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View W = super.W(layoutInflater, viewGroup, bundle);
        this.f17929x0 = FragmentOfflineVideosBinding.bind(W);
        this.f17927u0 = p.t();
        this.f17929x0.f4623e.setLayoutManager(new LinearLayoutManager(q()));
        this.f17929x0.f4621b.setOnClickListener(new u3.c(this, 11));
        if (UsersConfig.isPremiumAllowed(this.f17922p0.a())) {
            p pVar = this.f17927u0;
            pVar.e();
            y d = new RealmQuery(pVar, r3.d.class).d();
            OsResults l10 = d.f10977m.l(QueryDescriptor.getInstanceForSort(new a0(d.f10974c.i()), d.f10977m.f10905j, "createdAt", Sort.DESCENDING));
            String str = d.f10976j;
            y<r3.d> yVar = str != null ? new y<>(d.f10974c, l10, str) : new y<>(d.f10974c, l10, (Class<r3.d>) d.f10975f);
            yVar.f10974c.e();
            yVar.f10977m.h();
            this.f17928v0 = yVar;
            i iVar = new i(this.f17931z0, this.f17923q0, yVar, true, true);
            this.f17925s0 = iVar;
            this.f17929x0.f4623e.setAdapter(iVar);
            ((e0) this.f17929x0.f4623e.getItemAnimator()).f2972g = false;
            this.f17929x0.d.setVisibility(this.f17928v0.isEmpty() ? 0 : 8);
            y<r3.d> yVar2 = this.f17928v0;
            r rVar = new r() { // from class: x4.d
                @Override // io.realm.r
                public final void a(Object obj) {
                    e eVar = e.this;
                    String str2 = e.A0;
                    Objects.requireNonNull(eVar);
                    if (((y) obj).isEmpty()) {
                        eVar.f17929x0.d.setVisibility(eVar.f17928v0.isEmpty() ? 0 : 8);
                    }
                }
            };
            yVar2.e(rVar);
            OsResults osResults = yVar2.f10977m;
            Objects.requireNonNull(osResults);
            osResults.a(yVar2, new ObservableCollection.b(rVar));
            p pVar2 = this.f17927u0;
            RealmQuery h10 = a0.a.h(pVar2, pVar2, r3.d.class);
            Case r02 = Case.SENSITIVE;
            h10.f10812a.e();
            h10.c("status", "broken", r02);
            y<r3.d> d10 = h10.d();
            this.w0 = d10;
            this.f17926t0 = !d10.isEmpty();
            n().invalidateOptionsMenu();
            y<r3.d> yVar3 = this.w0;
            r rVar2 = new r() { // from class: x4.c
                @Override // io.realm.r
                public final void a(Object obj) {
                    e eVar = e.this;
                    y yVar4 = (y) obj;
                    eVar.f17926t0 = !eVar.w0.isEmpty();
                    eVar.n().invalidateOptionsMenu();
                }
            };
            yVar3.e(rVar2);
            OsResults osResults2 = yVar3.f10977m;
            Objects.requireNonNull(osResults2);
            osResults2.a(yVar3, new ObservableCollection.b(rVar2));
            this.f17929x0.f4622c.setVisibility(8);
        } else {
            this.f17929x0.f4622c.setVisibility(0);
        }
        HomeActivityViewModel homeActivityViewModel = this.f17930y0;
        if (homeActivityViewModel != null) {
            homeActivityViewModel.f5012j.l(new HomeActivityViewModel.ActivityStateEvent.f(false));
        }
        t3.a.x(q(), "Home", "OfflineVideos");
        return W;
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        y<r3.d> yVar = this.f17928v0;
        if (yVar != null) {
            yVar.h();
        }
        y<r3.d> yVar2 = this.w0;
        if (yVar2 != null) {
            yVar2.h();
        }
        p pVar = this.f17927u0;
        if (pVar != null) {
            pVar.close();
        }
        HomeActivityViewModel homeActivityViewModel = this.f17930y0;
        if (homeActivityViewModel != null) {
            homeActivityViewModel.f5012j.l(new HomeActivityViewModel.ActivityStateEvent.f(true));
        }
        this.f17929x0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean c0(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.restart_downloads) {
            if (this.f17923q0.a()) {
                Context q10 = q();
                if (Build.VERSION.SDK_INT >= 26) {
                    int i10 = VideoDlService.C;
                    Intent intent = new Intent(q10, VideoDlService.class);
                    intent.setAction("resume_all");
                    q10.startForegroundService(intent);
                } else {
                    int i11 = VideoDlService.C;
                    Intent intent2 = new Intent(q10, VideoDlService.class);
                    intent2.setAction("resume_all");
                    q10.startService(intent2);
                }
            } else {
                Snackbar k10 = Snackbar.k(this.f17929x0.f4623e, R.string.error_network_short, -2);
                k10.m(R.string.error_network_action_button, new b4.b(this, 12));
                k10.n();
            }
            return true;
        }
        return false;
    }
}
