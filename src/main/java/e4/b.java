package e4;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemLayoutVideoBinding;
import com.app.pornhub.databinding.LayoutDvdInfoBinding;
import com.app.pornhub.domain.model.dvd.Dvd;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.channeldetails.ChannelActivity;
import com.app.pornhub.view.common.widget.VideoViewCustom;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.appsflyer.oaid.BuildConfig;
import e4.b;
import j1.p;
import java.util.ArrayList;
import java.util.Objects;
import t3.o;

/* loaded from: classes.dex */
public class b extends RecyclerView.Adapter<RecyclerView.z> {
    public c d;

    /* renamed from: f  reason: collision with root package name */
    public final View.OnClickListener f9040f = new View.OnClickListener() { // from class: e4.a
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str = (String) view.getTag();
            if (!TextUtils.isEmpty(str)) {
                view.getContext().startActivity(ChannelActivity.C(view.getContext(), str));
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<a> f9039e = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f9041a;

        /* renamed from: b  reason: collision with root package name */
        public Dvd f9042b;

        /* renamed from: c  reason: collision with root package name */
        public VideoMetaData f9043c;

        public a() {
            this.f9041a = 2;
        }

        public a(int i10, Dvd dvd) {
            this.f9041a = i10;
            this.f9042b = dvd;
        }

        public a(int i10, VideoMetaData videoMetaData) {
            this.f9041a = i10;
            this.f9043c = videoMetaData;
        }
    }

    /* renamed from: e4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0126b extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final LayoutDvdInfoBinding f9044u;

        public C0126b(LayoutDvdInfoBinding layoutDvdInfoBinding) {
            super(layoutDvdInfoBinding.f4872a);
            this.f9044u = layoutDvdInfoBinding;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static class d extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final ItemLayoutVideoBinding f9045u;

        public d(ItemLayoutVideoBinding itemLayoutVideoBinding) {
            super(itemLayoutVideoBinding.f4725a);
            this.f9045u = itemLayoutVideoBinding;
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnTouchListener {

        /* renamed from: c  reason: collision with root package name */
        public int f9046c;

        /* renamed from: f  reason: collision with root package name */
        public FrameLayout f9047f;

        /* renamed from: j  reason: collision with root package name */
        public VideoViewCustom f9048j;

        /* renamed from: m  reason: collision with root package name */
        public ImageView f9049m;
        public long n;

        /* renamed from: t  reason: collision with root package name */
        public float f9050t;

        /* renamed from: u  reason: collision with root package name */
        public float f9051u;

        public e(int i10, FrameLayout frameLayout, ImageView imageView) {
            this.f9046c = i10;
            this.f9047f = frameLayout;
            this.f9049m = imageView;
        }

        public final void a(boolean z10) {
            this.f9047f.removeAllViews();
            this.f9047f.setVisibility(8);
            if (z10) {
                this.f9049m.animate().alpha(1.0f).setDuration(100L);
            } else {
                this.f9049m.setAlpha(1.0f);
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.n < 600) {
                    float f10 = this.f9050t;
                    float f11 = this.f9051u;
                    float x10 = f10 - motionEvent.getX();
                    float y = f11 - motionEvent.getY();
                    if (((float) Math.sqrt((y * y) + (x10 * x10))) / this.f9047f.getContext().getResources().getDisplayMetrics().density < 15.0f) {
                        new Handler().postDelayed(new p(this, 1), 500L);
                        b bVar = b.this;
                        m4.a aVar = (m4.a) bVar.d;
                        aVar.I0(VideoDetailsActivity.G(aVar.q(), bVar.f9039e.get(this.f9046c).f9043c.getVkey()));
                        return view.performClick();
                    }
                }
                return false;
            }
            this.n = System.currentTimeMillis();
            this.f9050t = motionEvent.getX();
            this.f9051u = motionEvent.getY();
            if (this.f9047f.getVisibility() != 0 && t3.p.a(b.this.f9039e.get(this.f9046c).f9043c)) {
                this.f9047f.setVisibility(0);
                c cVar = b.this.d;
                FrameLayout frameLayout = this.f9047f;
                m4.a aVar2 = (m4.a) cVar;
                int childCount = aVar2.f12887q0.f4571e.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    RecyclerView recyclerView = aVar2.f12887q0.f4571e;
                    RecyclerView.z J = recyclerView.J(recyclerView.getChildAt(i10));
                    if (J instanceof d) {
                        d dVar = (d) J;
                        if (!dVar.f9045u.f4729f.equals(frameLayout) && dVar.f9045u.f4729f.getVisibility() != 8) {
                            dVar.f9045u.f4729f.removeAllViews();
                            dVar.f9045u.f4729f.setVisibility(8);
                            dVar.f9045u.f4728e.animate().alpha(1.0f).setDuration(100L);
                        }
                    }
                }
                this.f9048j = new VideoViewCustom(this.f9047f.getContext());
                this.f9047f.removeAllViews();
                this.f9047f.addView(this.f9048j, new FrameLayout.LayoutParams(-2, -1));
                this.f9047f.addOnAttachStateChangeListener(new e4.f(this));
                this.f9048j.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: e4.e
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        b.e eVar = b.e.this;
                        Objects.requireNonNull(eVar);
                        int videoWidth = mediaPlayer.getVideoWidth();
                        int videoHeight = mediaPlayer.getVideoHeight();
                        VideoViewCustom videoViewCustom = eVar.f9048j;
                        videoViewCustom.f4989c = videoWidth;
                        videoViewCustom.f4990f = videoHeight;
                        if (videoWidth != 0 && videoHeight != 0) {
                            videoViewCustom.requestLayout();
                        }
                        mediaPlayer.setVolume(0.0f, 0.0f);
                        mediaPlayer.start();
                        eVar.f9049m.animate().alpha(0.0f).setDuration(200L);
                    }
                });
                this.f9048j.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: e4.c
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        b.e.this.a(true);
                    }
                });
                this.f9048j.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: e4.d
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer, int i11, int i12) {
                        b.e.this.a(true);
                        return false;
                    }
                });
                this.f9048j.setVideoURI(Uri.parse(b.this.f9039e.get(this.f9046c).f9043c.getPreviewUrl()));
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public ProgressBar f9053u;

        public f(View view) {
            super(view);
            this.f9053u = (ProgressBar) view.findViewById(R.id.progressBar);
        }
    }

    public b(c cVar) {
        this.d = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int a() {
        return this.f9039e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int c(int i10) {
        return this.f9039e.get(i10).f9041a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(RecyclerView.z zVar, int i10) {
        String str;
        int i11 = this.f9039e.get(i10).f9041a;
        int i12 = 0;
        if (i11 == 0) {
            C0126b c0126b = (C0126b) zVar;
            Dvd dvd = this.f9039e.get(i10).f9042b;
            View.OnClickListener onClickListener = this.f9040f;
            com.bumptech.glide.b.e(c0126b.f9044u.f4874c).o(dvd.getCover()).j(R.drawable.dvd_cover_placeholder).A(c0126b.f9044u.f4874c);
            c0126b.f9044u.f4875e.setText(a0.b.y(Integer.parseInt(dvd.getDuration()) * 1000));
            TextView textView = c0126b.f9044u.f4877g;
            try {
                str = a0.b.u(Integer.parseInt(dvd.getViewsCount()));
            } catch (NumberFormatException unused) {
                str = "N/A";
            }
            textView.setText(str);
            c0126b.f9044u.f4876f.setText(a0.b.Y(dvd.getVideosCount()));
            c0126b.f9044u.d.setText(dvd.getFromChannel());
            c0126b.f9044u.d.setTag(dvd.getChannelId());
            c0126b.f9044u.d.setOnClickListener(onClickListener);
            String string = c0126b.f9044u.f4873b.getContext().getString(R.string.description);
            SpannableString spannableString = new SpannableString(string.toUpperCase() + ": " + dvd.getDescription());
            spannableString.setSpan(new ForegroundColorSpan(-1), 0, string.length() + 1, 0);
            c0126b.f9044u.f4873b.setText(spannableString, TextView.BufferType.SPANNABLE);
        } else if (i11 != 1) {
            if (i11 == 2) {
                ((f) zVar).f9053u.setIndeterminate(true);
                return;
            }
            StringBuilder m10 = a1.a.m("Invalid type, can't bind this type ot items ");
            m10.append(this.f9039e.get(i10).f9041a);
            throw new IllegalStateException(m10.toString());
        } else {
            d dVar = (d) zVar;
            VideoMetaData videoMetaData = this.f9039e.get(i10).f9043c;
            ItemLayoutVideoBinding itemLayoutVideoBinding = dVar.f9045u;
            FrameLayout frameLayout = itemLayoutVideoBinding.f4729f;
            e eVar = new e(i10, frameLayout, itemLayoutVideoBinding.f4728e);
            frameLayout.setVisibility(8);
            dVar.f9045u.f4729f.removeAllViews();
            com.bumptech.glide.b.e(dVar.f9045u.f4728e).o(videoMetaData.getUrlThumbnail()).j(R.drawable.thumb_preview).A(dVar.f9045u.f4728e);
            o.b(videoMetaData.getVideoContentType(), dVar.f9045u.f4727c);
            if (videoMetaData.isHd()) {
                TextView textView2 = dVar.f9045u.f4734k;
                textView2.setText(textView2.getContext().getString(R.string.f21944hd));
            } else if (videoMetaData.isVr()) {
                TextView textView3 = dVar.f9045u.f4734k;
                textView3.setText(textView3.getContext().getString(R.string.vr));
            } else {
                dVar.f9045u.f4734k.setText(BuildConfig.FLAVOR);
            }
            ImageView imageView = dVar.f9045u.f4726b;
            if (!videoMetaData.isPaid()) {
                i12 = 8;
            }
            imageView.setVisibility(i12);
            dVar.f9045u.f4732i.setText(a0.b.y(videoMetaData.getDuration() * 1000));
            dVar.f9045u.f4733j.setText(videoMetaData.getTitle());
            dVar.f9045u.f4735l.setText(a0.b.u(videoMetaData.getViewCount()));
            dVar.f9045u.f4730g.setText(a0.b.z(videoMetaData.getRating()));
            dVar.f9045u.f4725a.setTag(videoMetaData.getVkey());
            dVar.f9045u.f4725a.setOnTouchListener(eVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z i(ViewGroup viewGroup, int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return new f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_progress, viewGroup, false));
                }
                throw new IllegalStateException(a1.a.j("Invalid type, can't create viewholder for this type ot items ", i10));
            }
            return new d(ItemLayoutVideoBinding.a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
        }
        return new C0126b(LayoutDvdInfoBinding.bind(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_dvd_info, viewGroup, false)));
    }

    public int m() {
        ArrayList<a> arrayList;
        int size = this.f9039e.size();
        if (size != 0) {
            if (this.f9039e.get(0).f9041a == 0) {
                size--;
            }
            if (this.f9039e.get(arrayList.size() - 1).f9041a == 2) {
                size--;
            }
        }
        return size;
    }

    public void n(boolean z10) {
        if (z10) {
            int size = this.f9039e.size();
            this.f9039e.add(size, new a());
            e(size);
            return;
        }
        int size2 = this.f9039e.size() - 1;
        if (this.f9039e.get(size2).f9041a == 2) {
            this.f9039e.remove(size2);
            f(size2);
        }
    }
}
