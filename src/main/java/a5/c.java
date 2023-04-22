package a5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.PhotosConfig;
import com.app.pornhub.domain.model.photo.Photo;
import com.app.pornhub.view.common.widget.SimpleViewPager;
import com.app.pornhub.view.photos.PhotosType;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.List;
import x2.m;
import z2.cp;

/* loaded from: classes.dex */
public class c extends Fragment implements cp {

    /* renamed from: v0  reason: collision with root package name */
    public static final String f177v0 = c.class.getSimpleName();

    /* renamed from: n0  reason: collision with root package name */
    public i3.a f178n0;

    /* renamed from: o0  reason: collision with root package name */
    public i3.d f179o0;

    /* renamed from: p0  reason: collision with root package name */
    public i3.d f180p0;

    /* renamed from: q0  reason: collision with root package name */
    public List<Photo> f181q0 = new ArrayList();

    /* renamed from: r0  reason: collision with root package name */
    public b f182r0;

    /* renamed from: s0  reason: collision with root package name */
    public PhotosType f183s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f184t0;

    /* renamed from: u0  reason: collision with root package name */
    public CompositeDisposable f185u0;

    @Override // androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        this.f183s0 = (PhotosType) this.f2019u.getSerializable("photos_type");
        this.f184t0 = this.f2019u.getInt("photo_index");
        this.f185u0 = new CompositeDisposable();
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_photo_details_pager, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        this.f185u0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        this.f181q0 = this.f180p0.f10495a.b();
        SimpleViewPager simpleViewPager = (SimpleViewPager) view.findViewById(R.id.pager);
        b bVar = new b(p(), this.f181q0);
        this.f182r0 = bVar;
        simpleViewPager.setAdapter(bVar);
        simpleViewPager.setCurrentItem(this.f184t0);
        if (PhotosConfig.Companion.hasMorePhotos(this.f181q0.size())) {
            this.f185u0.add((this.f183s0.ordinal() != 1 ? this.f178n0.a(this.f2019u.getString("album_id"), this.f181q0.size()) : this.f179o0.a(this.f2019u.getString("target_user_id"), this.f181q0.size())).subscribe(new m(this, 17)));
        }
    }
}
