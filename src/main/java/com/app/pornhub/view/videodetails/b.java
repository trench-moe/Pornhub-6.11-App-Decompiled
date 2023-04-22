package com.app.pornhub.view.videodetails;

import android.widget.SeekBar;
import t3.o;

/* loaded from: classes.dex */
public class b implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ VideoDetailsActivity f5593a;

    public b(VideoDetailsActivity videoDetailsActivity) {
        this.f5593a = videoDetailsActivity;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        this.f5593a.R.f4484e.A.setText(o.e(i10));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        VideoDetailsActivity videoDetailsActivity = this.f5593a;
        videoDetailsActivity.f5547h0.s(videoDetailsActivity.f5549j0);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        this.f5593a.f5547h0.t(seekBar.getProgress());
        VideoDetailsActivity videoDetailsActivity = this.f5593a;
        videoDetailsActivity.f5547h0.b(videoDetailsActivity.f5549j0, 1000L);
    }
}
