package x4;

import android.widget.SeekBar;
import com.app.pornhub.view.offline.OfflineVideoPlayerActivity;
import java.util.Timer;
import t3.o;

/* loaded from: classes2.dex */
public class g implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OfflineVideoPlayerActivity f17933a;

    public g(OfflineVideoPlayerActivity offlineVideoPlayerActivity) {
        this.f17933a = offlineVideoPlayerActivity;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        this.f17933a.L.f4440h.setText(o.e(i10));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        OfflineVideoPlayerActivity offlineVideoPlayerActivity = this.f17933a;
        int i10 = OfflineVideoPlayerActivity.T;
        offlineVideoPlayerActivity.H();
        this.f17933a.G();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        this.f17933a.R.n(seekBar.getProgress());
        OfflineVideoPlayerActivity offlineVideoPlayerActivity = this.f17933a;
        offlineVideoPlayerActivity.G();
        Timer timer = new Timer();
        offlineVideoPlayerActivity.O = timer;
        timer.schedule(new OfflineVideoPlayerActivity.a(null), 3000L);
        OfflineVideoPlayerActivity.C(this.f17933a);
    }
}
