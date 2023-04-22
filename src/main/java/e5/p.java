package e5;

import androidx.viewpager.widget.ViewPager;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import java.util.Locale;

/* loaded from: classes.dex */
public class p implements ViewPager.h {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ VideoDetailsActivity f9105c;

    public p(VideoDetailsActivity videoDetailsActivity) {
        this.f9105c = videoDetailsActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public void a(int i10, float f10, int i11) {
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public void b(int i10) {
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public void c(int i10) {
        VideoDetailsActivity videoDetailsActivity = this.f9105c;
        String lowerCase = videoDetailsActivity.R.d.getAdapter().f(i10).toString().toLowerCase(Locale.getDefault());
        t3.a.x(videoDetailsActivity, "Video", "related".equals(lowerCase) ? "VideoDetailRelated" : "comments".equals(lowerCase) ? "VideoDetailComments" : "VideoDetailInfo");
    }
}
