package e5;

import android.view.View;
import com.app.pornhub.R;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import java.util.Timer;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9092c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VideoDetailsActivity f9093f;

    public /* synthetic */ i(VideoDetailsActivity videoDetailsActivity, int i10) {
        this.f9092c = i10;
        this.f9093f = videoDetailsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9092c) {
            case 0:
                VideoDetailsActivity videoDetailsActivity = this.f9093f;
                videoDetailsActivity.Q(videoDetailsActivity.R.f4484e.f4854g.getVisibility() != 0);
                return;
            case 1:
                VideoDetailsActivity videoDetailsActivity2 = this.f9093f;
                int i10 = VideoDetailsActivity.f5539t0;
                videoDetailsActivity2.L();
                videoDetailsActivity2.f5554o0 = true;
                videoDetailsActivity2.f5555p0 = true;
                return;
            case 2:
                VideoDetailsActivity videoDetailsActivity3 = this.f9093f;
                if (videoDetailsActivity3.R.f4484e.f4852e.getVisibility() != 0) {
                    videoDetailsActivity3.P(true);
                }
                videoDetailsActivity3.d0();
                Timer timer = new Timer();
                videoDetailsActivity3.f5541b0 = timer;
                timer.schedule(new VideoDetailsActivity.d(null), 3000L);
                return;
            default:
                VideoDetailsActivity videoDetailsActivity4 = this.f9093f;
                if (videoDetailsActivity4.R.f4486g.getVisibility() == 0) {
                    videoDetailsActivity4.R.f4486g.setVisibility(8);
                    videoDetailsActivity4.R.f4482b.f4881b.setImageResource(R.drawable.arrow_info_expand);
                    return;
                }
                videoDetailsActivity4.R.f4486g.setVisibility(0);
                videoDetailsActivity4.R.f4482b.f4881b.setImageResource(R.drawable.arrow_info_close);
                return;
        }
    }
}
