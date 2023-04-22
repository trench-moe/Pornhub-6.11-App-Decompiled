package e5;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.comment.CommentsSource;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.comments.CommentsFragment;

/* loaded from: classes.dex */
public class h0 extends androidx.fragment.app.g0 {

    /* renamed from: j  reason: collision with root package name */
    public VideoMetaData f9090j;

    /* renamed from: k  reason: collision with root package name */
    public String[] f9091k;

    public h0(androidx.fragment.app.o oVar, VideoMetaData videoMetaData) {
        super(oVar.u());
        this.f9090j = videoMetaData;
        this.f9091k = oVar.getResources().getStringArray(R.array.video_detail_tabs);
    }

    @Override // y1.a
    public int e() {
        return this.f9091k.length;
    }

    @Override // y1.a
    public CharSequence f(int i10) {
        String[] strArr = this.f9091k;
        return strArr[i10 % strArr.length];
    }

    @Override // androidx.fragment.app.g0
    public Fragment m(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return CommentsFragment.N0(this.f9090j.getVkey(), CommentsSource.Video.INSTANCE);
                }
                throw new IllegalStateException(a1.a.j("No fragment defined for position ", i10));
            }
            VideoMetaData videoMetaData = this.f9090j;
            com.app.pornhub.view.videodetails.c cVar = new com.app.pornhub.view.videodetails.c();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_video", videoMetaData);
            cVar.A0(bundle);
            return cVar;
        }
        return new b0();
    }
}
