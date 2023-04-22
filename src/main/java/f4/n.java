package f4;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentGifdetailsInfoBinding;
import com.app.pornhub.domain.model.common.LikeStatus;
import com.app.pornhub.domain.model.gif.Gif;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.google.android.material.snackbar.Snackbar;
import f3.s;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x2.l0;
import x2.y;

/* loaded from: classes.dex */
public class n extends v3.c {
    public static final /* synthetic */ int E0 = 0;
    public CompositeDisposable A0;
    public View.OnClickListener B0;
    public View.OnClickListener C0;
    public View.OnClickListener D0;

    /* renamed from: p0  reason: collision with root package name */
    public f3.h f9413p0;

    /* renamed from: q0  reason: collision with root package name */
    public s f9414q0;

    /* renamed from: r0  reason: collision with root package name */
    public sc.c f9415r0;

    /* renamed from: s0  reason: collision with root package name */
    public u1.f f9416s0;

    /* renamed from: t0  reason: collision with root package name */
    public h3.a f9417t0;

    /* renamed from: u0  reason: collision with root package name */
    public d3.c f9418u0;

    /* renamed from: v0  reason: collision with root package name */
    public Gif f9419v0;
    public boolean w0;

    /* renamed from: x0  reason: collision with root package name */
    public LikeStatus f9420x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f9421y0;

    /* renamed from: z0  reason: collision with root package name */
    public FragmentGifdetailsInfoBinding f9422z0;

    public n() {
        super(R.layout.fragment_gifdetails_info);
        this.f9420x0 = LikeStatus.None.INSTANCE;
        this.f9421y0 = false;
        this.B0 = new f(this, 1);
        this.C0 = new h(this, 1);
        this.D0 = new g(this, 1);
    }

    public final void M0(String gifId, final LikeStatus likeStatus) {
        Completable complete;
        LikeStatus likeStatus2 = this.f9420x0;
        if (likeStatus2 == likeStatus || this.f9421y0) {
            return;
        }
        this.f9421y0 = true;
        CompositeDisposable compositeDisposable = this.A0;
        sc.c cVar = this.f9415r0;
        Objects.requireNonNull(cVar);
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Intrinsics.checkNotNullParameter(likeStatus2, "likeStatus");
        if (Intrinsics.areEqual(likeStatus2, LikeStatus.Like.INSTANCE)) {
            complete = ((b3.h) cVar.f14954f).h(gifId);
        } else if (Intrinsics.areEqual(likeStatus2, LikeStatus.Dislike.INSTANCE)) {
            complete = ((b3.h) cVar.f14954f).g(gifId);
        } else if (!Intrinsics.areEqual(likeStatus2, LikeStatus.None.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            complete = Completable.complete();
            Intrinsics.checkNotNullExpressionValue(complete, "complete()");
        }
        compositeDisposable.add(complete.subscribe(new Action() { // from class: f4.k
            @Override // io.reactivex.functions.Action
            public final void run() {
                n nVar = n.this;
                LikeStatus likeStatus3 = likeStatus;
                int i10 = n.E0;
                Objects.requireNonNull(nVar);
                kf.a.f12078a.e("Rate gif completed", new Object[0]);
                nVar.f9420x0 = likeStatus3;
                nVar.f9421y0 = false;
            }
        }, new l(this, 1)));
    }

    public final void N0(final boolean z10) {
        CompositeDisposable compositeDisposable = this.A0;
        u1.f fVar = this.f9416s0;
        String gifId = this.f9419v0.getGifMetaData().getId();
        Objects.requireNonNull(fVar);
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Observable startWith = ((b3.h) fVar.f15477c).f(gifId, z10).toObservable().map(l0.B).onErrorReturn(y.A).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "gifsRepository.favoriteG…th(UseCaseResult.Loading)");
        compositeDisposable.add(startWith.subscribe(new Consumer() { // from class: f4.m
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                n nVar = n.this;
                boolean z11 = z10;
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                int i10 = n.E0;
                Objects.requireNonNull(nVar);
                if (useCaseResult instanceof UseCaseResult.a) {
                    nVar.P0(true);
                } else {
                    nVar.P0(false);
                }
                if (useCaseResult instanceof UseCaseResult.Result) {
                    kf.a.f12078a.a("Marking gif favorite-> %s responded with: %s", Boolean.valueOf(z11), ((UseCaseResult.Result) useCaseResult).a());
                    nVar.O0(z11);
                    nVar.P0(false);
                }
                if (useCaseResult instanceof UseCaseResult.Failure) {
                    kf.a.f12078a.d(((UseCaseResult.Failure) useCaseResult).a(), "Error (un)favoriting gif with id %s", nVar.f9419v0.getGifMetaData().getId());
                }
            }
        }));
    }

    public final void O0(boolean z10) {
        this.w0 = z10;
        this.f9422z0.f4586e.setColorFilter(z10 ? new PorterDuffColorFilter(E().getColor(R.color.red), PorterDuff.Mode.SRC_ATOP) : null);
    }

    public final void P0(boolean z10) {
        if (z10) {
            this.f9422z0.f4587f.setVisibility(0);
            this.f9422z0.f4586e.setVisibility(8);
            return;
        }
        this.f9422z0.f4587f.setVisibility(8);
        this.f9422z0.f4586e.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void Q(int i10, int i11, Intent intent) {
        int intExtra;
        if (i10 != 1634 || (intExtra = intent.getIntExtra("selection", -1)) < 0) {
            return;
        }
        String reason = intent.getStringExtra("reason");
        CompositeDisposable compositeDisposable = this.A0;
        h3.a aVar = this.f9417t0;
        String gifId = this.f9419v0.getGifMetaData().getId();
        Objects.requireNonNull(aVar);
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        compositeDisposable.add(aVar.f10110a.c(gifId, intExtra, reason).subscribe(new Action() { // from class: f4.j
            @Override // io.reactivex.functions.Action
            public final void run() {
                n nVar = n.this;
                int i12 = n.E0;
                Objects.requireNonNull(nVar);
                kf.a.f12078a.a("Flag gif completed", new Object[0]);
                if (nVar.L()) {
                    Snackbar.k(nVar.f9422z0.f4591j, R.string.gif_flagged, -1).n();
                }
            }
        }, new l(this, 0)));
        kf.a.f12078a.a("Flag gif %s with flag id %s and reason %s", this.f9419v0.getGifMetaData().getId(), Integer.valueOf(intExtra), reason);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View W = super.W(layoutInflater, viewGroup, bundle);
        this.f9422z0 = FragmentGifdetailsInfoBinding.bind(W);
        this.A0 = new CompositeDisposable();
        this.f9419v0 = (Gif) this.f2019u.getSerializable("key_gif");
        this.f9422z0.f4595o.setOnClickListener(new View.OnClickListener(this) { // from class: f4.e

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ n f9397f;

            {
                this.f9397f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        n nVar = this.f9397f;
                        int i10 = n.E0;
                        Drawable drawable = nVar.E().getDrawable(R.drawable.like);
                        int color = nVar.E().getColor(R.color.green);
                        if (drawable != null) {
                            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                        }
                        nVar.f9422z0.f4595o.setImageDrawable(drawable);
                        Drawable drawable2 = nVar.E().getDrawable(R.drawable.dislike);
                        if (drawable2 != null) {
                            drawable2.setColorFilter(null);
                        }
                        nVar.f9422z0.d.setImageDrawable(drawable2);
                        nVar.M0(nVar.f9419v0.getGifMetaData().getId(), LikeStatus.Like.INSTANCE);
                        return;
                    default:
                        n nVar2 = this.f9397f;
                        if (TextUtils.isEmpty(nVar2.f9419v0.getFromVkey())) {
                            return;
                        }
                        nVar2.I0(VideoDetailsActivity.G(nVar2.q(), nVar2.f9419v0.getFromVkey()));
                        return;
                }
            }
        });
        this.f9422z0.d.setOnClickListener(new u3.c(this, 3));
        this.f9422z0.f4586e.setOnClickListener(new u3.a(this, 4));
        this.f9422z0.f4599s.setOnClickListener(new f(this, 0));
        this.f9422z0.f4588g.setOnClickListener(new h(this, 0));
        this.f9422z0.f4590i.setOnClickListener(new g(this, 0));
        this.f9422z0.f4589h.setOnClickListener(new View.OnClickListener(this) { // from class: f4.e

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ n f9397f;

            {
                this.f9397f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        n nVar = this.f9397f;
                        int i10 = n.E0;
                        Drawable drawable = nVar.E().getDrawable(R.drawable.like);
                        int color = nVar.E().getColor(R.color.green);
                        if (drawable != null) {
                            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
                        }
                        nVar.f9422z0.f4595o.setImageDrawable(drawable);
                        Drawable drawable2 = nVar.E().getDrawable(R.drawable.dislike);
                        if (drawable2 != null) {
                            drawable2.setColorFilter(null);
                        }
                        nVar.f9422z0.d.setImageDrawable(drawable2);
                        nVar.M0(nVar.f9419v0.getGifMetaData().getId(), LikeStatus.Like.INSTANCE);
                        return;
                    default:
                        n nVar2 = this.f9397f;
                        if (TextUtils.isEmpty(nVar2.f9419v0.getFromVkey())) {
                            return;
                        }
                        nVar2.I0(VideoDetailsActivity.G(nVar2.q(), nVar2.f9419v0.getFromVkey()));
                        return;
                }
            }
        });
        this.f9422z0.f4591j.setText(this.f9419v0.getGifMetaData().getTitle());
        this.f9422z0.f4601u.setText(a0.b.u(this.f9419v0.getViews()));
        this.f9422z0.f4597q.setText(a0.b.z(this.f9419v0.getVotePercent()));
        this.f9422z0.f4598r.setProgress(this.f9419v0.getVotePercent());
        this.f9419v0.getUserMetaData();
        if (TextUtils.isEmpty(this.f9419v0.getUserMetaData().getId())) {
            this.f9422z0.f4593l.setVisibility(8);
        } else {
            this.f9422z0.f4590i.setText(this.f9419v0.getUserMetaData().getUsername());
        }
        this.f9422z0.f4589h.setText(this.f9419v0.getFromVideoTitle());
        this.f9422z0.f4584b.setText(a0.b.x(this.f9419v0.getPostedOn()));
        O0(this.f9419v0.isFavorite());
        Drawable drawable = E().getDrawable(R.drawable.like);
        if (drawable != null) {
            drawable.setColorFilter(null);
        }
        this.f9422z0.f4595o.setImageDrawable(drawable);
        Drawable drawable2 = E().getDrawable(R.drawable.dislike);
        if (drawable2 != null) {
            drawable2.setColorFilter(null);
        }
        this.f9422z0.d.setImageDrawable(drawable2);
        if (this.f9419v0.getCategories().isEmpty()) {
            this.f9422z0.f4592k.setVisibility(8);
        } else {
            this.A0.add(this.f9418u0.a(Arrays.asList(this.f9419v0.getCategories().split(","))).subscribe(new x2.m(this, 8)));
        }
        if (this.f9419v0.getTags().isEmpty()) {
            this.f9422z0.n.setVisibility(8);
        } else {
            this.f9422z0.f4600t.removeAllViews();
            this.f9422z0.n.setVisibility(0);
            for (String str : this.f9419v0.getTags()) {
                TextView textView = (TextView) x().inflate(R.layout.textview_tags, (ViewGroup) null);
                textView.setText(str);
                textView.setTag(str);
                textView.setOnClickListener(this.C0);
                this.f9422z0.f4600t.addView(textView);
            }
        }
        if (this.f9419v0.getPornStar().isEmpty()) {
            this.f9422z0.f4594m.setVisibility(8);
        } else {
            String[] split = this.f9419v0.getPornStar().split(",");
            this.f9422z0.f4596p.removeAllViews();
            this.f9422z0.f4594m.setVisibility(0);
            for (String str2 : split) {
                TextView textView2 = (TextView) x().inflate(R.layout.textview_tags, (ViewGroup) null);
                textView2.setText(str2);
                textView2.setTag(str2);
                textView2.setOnClickListener(this.D0);
                this.f9422z0.f4596p.addView(textView2);
            }
        }
        return W;
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.A0.clear();
        this.f9422z0 = null;
    }
}
