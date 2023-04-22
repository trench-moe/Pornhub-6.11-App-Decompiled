package com.mixpanel.android.mpmetrics;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.pornhub.R;
import com.mixpanel.android.mpmetrics.s;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ClickableViewAccessibility"})
@TargetApi(16)
/* loaded from: classes.dex */
public class f extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public k f8246c;

    /* renamed from: f  reason: collision with root package name */
    public Activity f8247f;

    /* renamed from: j  reason: collision with root package name */
    public GestureDetector f8248j;

    /* renamed from: m  reason: collision with root package name */
    public Handler f8249m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public s.b.C0110b f8250t;

    /* renamed from: u  reason: collision with root package name */
    public Runnable f8251u;

    /* renamed from: w  reason: collision with root package name */
    public Runnable f8252w;
    public View y;

    /* renamed from: z  reason: collision with root package name */
    public AtomicBoolean f8253z = new AtomicBoolean();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.a(f.this);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* loaded from: classes.dex */
        public class a implements View.OnTouchListener {
            public a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return f.this.f8248j.onTouchEvent(motionEvent);
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.y.setVisibility(0);
            f.this.y.setOnTouchListener(new a());
            float applyDimension = TypedValue.applyDimension(1, 65.0f, f.this.f8247f.getResources().getDisplayMetrics());
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, applyDimension, 0.0f);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration(200L);
            f.this.y.startAnimation(translateAnimation);
            float f10 = applyDimension / 2.0f;
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, f10, f10);
            scaleAnimation.setInterpolator(new d(f.this));
            scaleAnimation.setDuration(400L);
            scaleAnimation.setStartOffset(200L);
            ((ImageView) f.this.y.findViewById(R.id.com_mixpanel_android_notification_image)).startAnimation(scaleAnimation);
        }
    }

    /* loaded from: classes.dex */
    public class c implements GestureDetector.OnGestureListener {
        public c() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (f11 > 0.0f) {
                f.a(f.this);
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            JSONObject jSONObject;
            h hVar = (h) f.this.f8250t.f8315c;
            String str = hVar.B;
            JSONObject jSONObject2 = null;
            if (str != null && str.length() > 0) {
                try {
                    Uri parse = Uri.parse(str);
                    try {
                        f.this.f8247f.startActivity(new Intent("android.intent.action.VIEW", parse));
                    } catch (ActivityNotFoundException unused) {
                        cb.e.O("MixpanelAPI.InAppFrag", "User doesn't have an activity for notification URI " + parse);
                    }
                    try {
                        jSONObject = new JSONObject();
                    } catch (JSONException unused2) {
                    }
                    try {
                        jSONObject.put("url", str);
                        jSONObject2 = jSONObject;
                    } catch (JSONException unused3) {
                        jSONObject2 = jSONObject;
                        cb.e.B("MixpanelAPI.InAppFrag", "Can't put url into json properties");
                        f.this.f8246c.f8277e.i("$campaign_open", hVar, jSONObject2);
                        f.a(f.this);
                        return true;
                    }
                } catch (IllegalArgumentException e10) {
                    cb.e.N("MixpanelAPI.InAppFrag", "Can't parse notification URI, will not take any action", e10);
                    return true;
                }
            }
            f.this.f8246c.f8277e.i("$campaign_open", hVar, jSONObject2);
            f.a(f.this);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class d implements Interpolator {
        public d(f fVar) {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return ((float) (-(Math.cos(f10 * 12.0f) * Math.pow(2.718281828459045d, (-8.0f) * f10)))) + 1.0f;
        }
    }

    public static void a(f fVar) {
        boolean isDestroyed = fVar.f8247f.isDestroyed();
        Activity activity = fVar.f8247f;
        if (activity != null && !activity.isFinishing() && !isDestroyed && !fVar.f8253z.get()) {
            fVar.f8249m.removeCallbacks(fVar.f8251u);
            fVar.f8249m.removeCallbacks(fVar.f8252w);
            FragmentManager fragmentManager = fVar.f8247f.getFragmentManager();
            try {
                fragmentManager.beginTransaction().setCustomAnimations(0, R.animator.com_mixpanel_android_slide_down).remove(fVar).commit();
            } catch (IllegalStateException unused) {
                fragmentManager.beginTransaction().setCustomAnimations(0, R.animator.com_mixpanel_android_slide_down).remove(fVar).commitAllowingStateLoss();
            }
            s.d(fVar.n);
            fVar.f8253z.set(true);
        }
    }

    public final void b() {
        if (!this.f8253z.get()) {
            Handler handler = this.f8249m;
            if (handler != null) {
                handler.removeCallbacks(this.f8251u);
                this.f8249m.removeCallbacks(this.f8252w);
            }
            s.d(this.n);
            FragmentManager fragmentManager = this.f8247f.getFragmentManager();
            try {
                fragmentManager.beginTransaction().remove(this).commit();
            } catch (IllegalStateException unused) {
                fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
            }
        }
        this.f8253z.set(true);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f8247f = activity;
        if (this.f8250t == null) {
            b();
            return;
        }
        this.f8249m = new Handler();
        this.f8251u = new a();
        this.f8252w = new b();
        this.f8248j = new GestureDetector(activity, new c());
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f8253z.set(false);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.f8250t == null) {
            b();
        } else {
            View inflate = layoutInflater.inflate(R.layout.com_mixpanel_android_activity_notification_mini, viewGroup, false);
            this.y = inflate;
            TextView textView = (TextView) inflate.findViewById(R.id.com_mixpanel_android_notification_title);
            ImageView imageView = (ImageView) this.y.findViewById(R.id.com_mixpanel_android_notification_image);
            h hVar = (h) this.f8250t.f8315c;
            textView.setText(hVar.f8171t);
            textView.setTextColor(hVar.f8172u);
            imageView.setImageBitmap(hVar.f8174z);
            this.f8249m.postDelayed(this.f8251u, 10000L);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(hVar.n);
            gradientDrawable.setCornerRadius(t3.a.h(7.0f, getActivity()));
            gradientDrawable.setStroke((int) t3.a.h(2.0f, getActivity()), hVar.D);
            this.y.setBackground(gradientDrawable);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), this.f8250t.f8315c.f8174z);
            bitmapDrawable.setColorFilter(hVar.C, PorterDuff.Mode.SRC_ATOP);
            imageView.setImageDrawable(bitmapDrawable);
        }
        return this.y;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        b();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f8249m.postDelayed(this.f8252w, 500L);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.f8253z.get()) {
            this.f8247f.getFragmentManager().beginTransaction().remove(this).commit();
        }
    }
}
