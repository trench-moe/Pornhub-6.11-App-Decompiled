package a5;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g0;
import androidx.fragment.app.y;
import com.app.pornhub.domain.model.photo.Photo;
import java.util.List;

/* loaded from: classes.dex */
public class b extends g0 {

    /* renamed from: j  reason: collision with root package name */
    public List<Photo> f176j;

    public b(y yVar, List<Photo> list) {
        super(yVar);
        this.f176j = list;
    }

    @Override // y1.a
    public int e() {
        return this.f176j.size();
    }

    @Override // y1.a
    public CharSequence f(int i10) {
        return Integer.toString(i10 + 1);
    }

    @Override // androidx.fragment.app.g0
    public Fragment m(int i10) {
        int i11 = a.f172p0;
        Bundle bundle = new Bundle();
        bundle.putString("photo_url", this.f176j.get(i10).getUrlPhoto());
        a aVar = new a();
        aVar.A0(bundle);
        return aVar;
    }
}
