package x4;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemOfflineVideoBinding;
import com.app.pornhub.domain.model.video.VideoContentType;
import com.app.pornhub.service.VideoDlService;
import com.app.pornhub.view.offline.OfflineVideoPlayerActivity;
import com.appsflyer.oaid.BuildConfig;
import io.realm.Case;
import io.realm.OrderedRealmCollection;
import io.realm.RealmQuery;
import io.realm.p;
import io.realm.u;
import io.realm.v;
import java.util.HashSet;
import java.util.Objects;
import t3.o;

/* loaded from: classes2.dex */
public class i extends c4.g<r3.d, d> {

    /* renamed from: h  reason: collision with root package name */
    public c f17935h;

    /* renamed from: i  reason: collision with root package name */
    public q3.a f17936i;

    /* renamed from: j  reason: collision with root package name */
    public HashSet<String> f17937j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f17938k;

    /* renamed from: l  reason: collision with root package name */
    public View.OnClickListener f17939l;

    /* renamed from: m  reason: collision with root package name */
    public View.OnLongClickListener f17940m;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = i.this;
            if (iVar.f17938k) {
                if (iVar.f17937j.contains((String) view.getTag())) {
                    i.this.f17937j.remove((String) view.getTag());
                } else {
                    i.this.f17937j.add((String) view.getTag());
                }
                i.this.f2802a.b();
                return;
            }
            p t2 = p.t();
            RealmQuery h10 = a0.a.h(t2, t2, r3.d.class);
            Case r32 = Case.SENSITIVE;
            h10.f10812a.e();
            h10.c("vkey", (String) view.getTag(), r32);
            r3.d dVar = (r3.d) h10.e();
            if (dVar != null && v.w(dVar)) {
                if (dVar.x()) {
                    Context context = view.getContext();
                    Context context2 = view.getContext();
                    int i10 = OfflineVideoPlayerActivity.T;
                    Intent intent = new Intent(context2, OfflineVideoPlayerActivity.class);
                    intent.putExtra("vkey", (String) view.getTag());
                    context.startActivity(intent);
                } else if ("broken".equals(dVar.b()) && i.this.f17936i.a()) {
                    kf.a.f12078a.a("Start video download; Start one ::::::::::::", new Object[0]);
                    Context context3 = view.getContext();
                    String p10 = dVar.p();
                    if (Build.VERSION.SDK_INT >= 26) {
                        int i11 = VideoDlService.C;
                        Intent intent2 = new Intent(context3, VideoDlService.class);
                        intent2.setAction("resume_signle_video");
                        intent2.putExtra("vkey", p10);
                        context3.startForegroundService(intent2);
                    } else {
                        int i12 = VideoDlService.C;
                        Intent intent3 = new Intent(context3, VideoDlService.class);
                        intent3.setAction("resume_signle_video");
                        intent3.putExtra("vkey", p10);
                        context3.startService(intent3);
                    }
                }
                t2.close();
            }
            t2.close();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            i iVar = i.this;
            if (!iVar.f17938k) {
                String str = e.A0;
                v3.b bVar = (v3.b) ((e) ((g4.f) iVar.f17935h).f9735f).n();
                Objects.requireNonNull(bVar);
                bVar.J = bVar.x().A(new v3.a(bVar));
                i iVar2 = i.this;
                iVar2.f17938k = true;
                iVar2.f17937j.add((String) view.getTag());
                i.this.f2802a.b();
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes2.dex */
    public static class d extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final ItemOfflineVideoBinding f17943u;

        public d(ItemOfflineVideoBinding itemOfflineVideoBinding) {
            super(itemOfflineVideoBinding.f4736a);
            this.f17943u = itemOfflineVideoBinding;
        }
    }

    public i(c cVar, q3.a aVar, OrderedRealmCollection orderedRealmCollection, boolean z10, boolean z11) {
        super(orderedRealmCollection, z10, z11);
        this.f17939l = new a();
        this.f17940m = new b();
        this.f17935h = cVar;
        this.f17936i = aVar;
        this.f17937j = new HashSet<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(RecyclerView.z zVar, int i10) {
        VideoContentType videoContentType;
        boolean z10;
        d dVar = (d) zVar;
        r3.d dVar2 = (r3.d) (m() ? (u) this.f3743g.get(i10) : null);
        HashSet<String> hashSet = this.f17937j;
        View.OnClickListener onClickListener = this.f17939l;
        View.OnLongClickListener onLongClickListener = this.f17940m;
        com.bumptech.glide.b.e(dVar.f17943u.d).o(dVar2.n()).j(R.drawable.thumb_preview).A(dVar.f17943u.d);
        short i11 = dVar2.i();
        if (i11 == 0) {
            videoContentType = VideoContentType.FREE;
        } else if (i11 == 1) {
            videoContentType = VideoContentType.FREE_PREMIUM;
        } else if (i11 != 2) {
            throw new IllegalStateException("videoContentTypeCode contains unacceptable value which doesn't correspond to any VideoContentType enum value.");
        } else {
            videoContentType = VideoContentType.PREMIUM;
        }
        o.b(videoContentType, dVar.f17943u.f4737b);
        if (dVar2.l()) {
            TextView textView = dVar.f17943u.f4745k;
            textView.setText(textView.getContext().getString(R.string.vr));
        } else if (dVar2.e()) {
            TextView textView2 = dVar.f17943u.f4745k;
            textView2.setText(textView2.getContext().getString(R.string.f21944hd));
        } else {
            dVar.f17943u.f4745k.setText(BuildConfig.FLAVOR);
        }
        dVar.f17943u.f4743i.setText(a0.b.y(dVar2.c() * 1000));
        dVar.f17943u.f4744j.setText(dVar2.m());
        if (dVar2.g().isEmpty()) {
            dVar.f17943u.f4742h.setVisibility(8);
            dVar.f17943u.f4738c.setVisibility(8);
        } else {
            dVar.f17943u.f4742h.setVisibility(0);
            dVar.f17943u.f4742h.setText(dVar2.g());
            if (dVar2.k().equals("verified")) {
                dVar.f17943u.f4738c.setVisibility(0);
                dVar.f17943u.f4738c.setImageResource(R.drawable.ic_blue_checkmark);
            } else if (dVar2.k().equals("contentPartner")) {
                dVar.f17943u.f4738c.setVisibility(0);
                dVar.f17943u.f4738c.setImageResource(R.drawable.ic_tv);
            } else {
                dVar.f17943u.f4738c.setVisibility(8);
            }
        }
        String b10 = dVar2.b();
        Objects.requireNonNull(b10);
        switch (b10.hashCode()) {
            case -1380616235:
                if (b10.equals("broken")) {
                    z10 = false;
                    break;
                }
                z10 = true;
                break;
            case -1211129254:
                if (b10.equals("downloading")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case -948696717:
                if (b10.equals("queued")) {
                    z10 = true;
                    break;
                }
                z10 = true;
                break;
            case -673660814:
                if (!b10.equals("finished")) {
                    z10 = true;
                    break;
                } else {
                    z10 = true;
                    break;
                }
            default:
                z10 = true;
                break;
        }
        if (!z10) {
            dVar.f17943u.f4741g.setVisibility(0);
            dVar.f17943u.f4741g.setImageResource(R.drawable.ic_broken_image);
            dVar.f17943u.f4739e.setVisibility(8);
            dVar.f17943u.f4740f.setVisibility(8);
        } else if (z10) {
            dVar.f17943u.f4741g.setVisibility(8);
            dVar.f17943u.f4739e.setVisibility(0);
            dVar.f17943u.f4739e.setProgress(dVar2.d());
            dVar.f17943u.f4740f.setVisibility(0);
            dVar.f17943u.f4740f.setText(String.valueOf(dVar2.d()) + "%");
        } else if (z10) {
            dVar.f17943u.f4741g.setVisibility(0);
            dVar.f17943u.f4741g.setImageResource(R.drawable.ic_queued);
            dVar.f17943u.f4739e.setVisibility(8);
            dVar.f17943u.f4740f.setVisibility(8);
        } else if (z10) {
            dVar.f17943u.f4741g.setVisibility(8);
            dVar.f17943u.f4739e.setVisibility(8);
            dVar.f17943u.f4740f.setVisibility(8);
        }
        dVar.f17943u.f4736a.setTag(dVar2.p());
        dVar.f17943u.f4736a.setOnClickListener(onClickListener);
        dVar.f17943u.f4736a.setOnLongClickListener(onLongClickListener);
        if (hashSet.contains(dVar2.p())) {
            ConstraintLayout constraintLayout = dVar.f17943u.f4736a;
            constraintLayout.setBackgroundColor(c0.a.b(constraintLayout.getContext(), R.color.orange));
            return;
        }
        ConstraintLayout constraintLayout2 = dVar.f17943u.f4736a;
        constraintLayout2.setBackgroundColor(c0.a.b(constraintLayout2.getContext(), R.color.transparent));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z i(ViewGroup viewGroup, int i10) {
        return new d(ItemOfflineVideoBinding.bind(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_offline_video, viewGroup, false)));
    }
}
