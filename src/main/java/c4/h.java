package c4;

import com.app.pornhub.domain.model.gif.GifMetaData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h extends c4.a<GifMetaData> {

    /* loaded from: classes.dex */
    public interface a {
        void h(String str);
    }

    public h() {
        super(new ArrayList());
    }

    public void q(List<GifMetaData> list) {
        int size = this.d.size();
        this.d.addAll(list);
        this.f2802a.e(size, list.size());
    }
}
