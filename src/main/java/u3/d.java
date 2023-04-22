package u3;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import androidx.fragment.app.l;
import com.app.pornhub.R;
import com.app.pornhub.databinding.DialogfragmentAdBinding;
import com.app.pornhub.domain.model.ads_promo.PornhubAd;
import com.app.pornhub.view.ads.AdActivity;
import io.reactivex.disposables.CompositeDisposable;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import t3.g;
import x2.m;
import z2.cp;

/* loaded from: classes2.dex */
public class d extends l implements cp {
    public static final /* synthetic */ int J0 = 0;
    public k2.c D0;
    public q3.d E0;
    public c F0;
    public CompositeDisposable G0;
    public PornhubAd H0;
    public DialogfragmentAdBinding I0;

    /* loaded from: classes2.dex */
    public class b implements View.OnTouchListener {

        /* renamed from: c  reason: collision with root package name */
        public PornhubAd f15520c;

        public b(PornhubAd pornhubAd) {
            this.f15520c = pornhubAd;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                d dVar = d.this;
                PornhubAd pornhubAd = this.f15520c;
                Objects.requireNonNull(dVar);
                Intent intent = new Intent(dVar.q(), AdActivity.class);
                intent.putExtra("ad_url", pornhubAd.getLink());
                dVar.I0(intent);
                g.e(d.this.q(), true, Long.valueOf(this.f15520c.getAdId()), Integer.valueOf(this.f15520c.getMemberId()), Long.valueOf(this.f15520c.getCampaignId()), this.f15520c.getLink());
                d.this.L0(false, false);
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<d> f15522a;

        /* renamed from: b  reason: collision with root package name */
        public PornhubAd f15523b;

        public c(d dVar, a aVar) {
            this.f15522a = new WeakReference<>(dVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            d dVar = this.f15522a.get();
            if (dVar != null) {
                int i10 = message.what;
                if (i10 == 100) {
                    dVar.F0.sendEmptyMessageDelayed(300, 12000L);
                    if (dVar.P()) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setInterpolator(new LinearInterpolator());
                        alphaAnimation.setDuration(1000L);
                        dVar.I0.f4503c.startAnimation(alphaAnimation);
                        dVar.I0.f4503c.setVisibility(0);
                        dVar.I0.d.startAnimation(alphaAnimation);
                        dVar.I0.d.setVisibility(0);
                        dVar.I0.f4504e.startAnimation(alphaAnimation);
                        dVar.I0.f4504e.setVisibility(0);
                    }
                } else if (i10 == 200) {
                    dVar.F0.sendEmptyMessageDelayed(100, 1000L);
                } else if (i10 != 300) {
                } else {
                    dVar.L0(true, false);
                    Context q10 = dVar.q();
                    PornhubAd pornhubAd = this.f15523b;
                    if (pornhubAd != null) {
                        Long valueOf = Long.valueOf(pornhubAd.getAdId());
                        Integer valueOf2 = Integer.valueOf(this.f15523b.getMemberId());
                        Long valueOf3 = Long.valueOf(this.f15523b.getCampaignId());
                        String adUrl = this.f15523b.getLink();
                        Intrinsics.checkNotNullParameter(adUrl, "adUrl");
                        if (q10 == null) {
                            return;
                        }
                        g.g(q10, "phapp_ad_auto_close", true, valueOf, valueOf2, valueOf3, adUrl);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        this.G0 = new CompositeDisposable();
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.I0 = DialogfragmentAdBinding.bind(layoutInflater.inflate(R.layout.dialogfragment_ad, viewGroup, false));
        O0(false);
        this.f2188y0.getWindow().requestFeature(1);
        this.f2188y0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.I0.f4502b.setVerticalScrollBarEnabled(false);
        this.I0.f4502b.setHorizontalScrollBarEnabled(false);
        this.I0.f4503c.setOnClickListener(new u3.b(this, 0));
        this.I0.d.setOnClickListener(new u3.c(this, 0));
        this.I0.f4504e.setOnClickListener(new u3.a(this, 0));
        this.F0 = new c(this, null);
        this.I0.f4502b.setOnClickListener(null);
        this.G0.add(this.D0.r().subscribe(new m(this, 4)));
        this.F0.sendEmptyMessage(200);
        return this.I0.f4501a;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.G0.clear();
        this.F0.removeCallbacksAndMessages(null);
        this.I0.f4502b.removeAllViews();
        this.I0.f4502b.destroy();
        this.I0 = null;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void i0() {
        super.i0();
        int p10 = m9.a.f13010j - m9.a.p(64);
        this.f2188y0.getWindow().setLayout(p10, -2);
        ViewGroup.LayoutParams layoutParams = this.I0.f4502b.getLayoutParams();
        layoutParams.height = (int) (p10 * 0.8333333f);
        this.I0.f4502b.setLayoutParams(layoutParams);
        this.I0.f4502b.setBackgroundColor(-16777216);
    }
}
