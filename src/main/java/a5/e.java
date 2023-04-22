package a5;

import a5.d;
import android.os.Bundle;
import android.view.View;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.view.photos.PhotosType;
import f3.i;
import f3.o;
import io.reactivex.disposables.CompositeDisposable;
import x2.g;

/* loaded from: classes.dex */
public class e extends d4.a implements d.a {
    public static final String I0 = e.class.getSimpleName();
    public i3.d A0;
    public i B0;
    public o C0;
    public UserOrientation D0;
    public d E0;
    public PhotosType F0;
    public String G0;
    public CompositeDisposable H0;

    /* renamed from: z0  reason: collision with root package name */
    public i3.a f190z0;

    @Override // d4.a
    public void K0() {
        if (this.F0 == null) {
            V0(I(R.string.error_default), UsersConfig.isGay(this.D0));
        } else {
            this.H0.add((this.F0.ordinal() != 1 ? this.f190z0.a(this.f2019u.getString("album_id"), this.E0.a()) : this.A0.a(this.G0, this.E0.a())).subscribe(new g(this, 15)));
        }
    }

    @Override // d4.a
    public c4.a L0() {
        return this.E0;
    }

    @Override // d4.a
    public String M0() {
        return I(R.string.no_photos_to_display);
    }

    @Override // d4.a
    public int O0() {
        return 4;
    }

    @Override // d4.a
    public void P0() {
        this.E0 = new d(this);
        this.f8761q0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        this.F0 = (PhotosType) this.f2019u.getSerializable("photos_type");
        this.G0 = this.f2019u.getString("target_user_id");
        this.H0 = new CompositeDisposable();
    }

    @Override // d4.a
    public void W0() {
        if (this.F0 == PhotosType.FAVORITES) {
            t3.a.x(q(), "UserProfile", this.G0.equals(this.B0.a()) ? "MyPhotosFavorites" : "UserPhotosFavorites");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        this.H0.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        this.D0 = this.C0.a().getOrientation();
    }
}
