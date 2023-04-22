package f4;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.comment.CommentsSource;
import com.app.pornhub.domain.model.gif.Gif;
import com.app.pornhub.view.comments.CommentsFragment;

/* loaded from: classes.dex */
public class p extends g0 {

    /* renamed from: j  reason: collision with root package name */
    public Gif f9424j;

    /* renamed from: k  reason: collision with root package name */
    public String[] f9425k;

    public p(androidx.fragment.app.o oVar, Gif gif) {
        super(oVar.u());
        this.f9424j = gif;
        this.f9425k = oVar.getResources().getStringArray(R.array.gif_detail_tabs);
    }

    @Override // y1.a
    public int e() {
        return this.f9425k.length;
    }

    @Override // y1.a
    public CharSequence f(int i10) {
        String[] strArr = this.f9425k;
        return strArr[i10 % strArr.length];
    }

    @Override // androidx.fragment.app.g0
    public Fragment m(int i10) {
        if (i10 == 0) {
            String id2 = this.f9424j.getGifMetaData().getId();
            int i11 = q.E0;
            Bundle b10 = android.support.v4.media.b.b("gif_id", id2);
            q qVar = new q();
            qVar.A0(b10);
            return qVar;
        } else if (i10 == 1) {
            Gif gif = this.f9424j;
            n nVar = new n();
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_gif", gif);
            nVar.A0(bundle);
            return nVar;
        } else if (i10 != 2) {
            if (i10 == 3) {
                return CommentsFragment.N0(this.f9424j.getGifMetaData().getId(), CommentsSource.Gif.INSTANCE);
            }
            throw new IllegalStateException(a1.a.j("No fragment defined for position ", i10));
        } else {
            String id3 = this.f9424j.getGifMetaData().getId();
            int i12 = o.E0;
            Bundle b11 = android.support.v4.media.b.b("gif_id", id3);
            o oVar = new o();
            oVar.A0(b11);
            return oVar;
        }
    }
}
