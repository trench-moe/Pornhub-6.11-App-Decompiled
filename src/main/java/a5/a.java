package a5;

import a6.g;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentPhotoDisplayBinding;
import com.app.pornhub.domain.config.UsersConfig;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import f3.o;
import z2.cp;

/* loaded from: classes.dex */
public class a extends Fragment implements cp {

    /* renamed from: p0  reason: collision with root package name */
    public static final /* synthetic */ int f172p0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public o f173n0;

    /* renamed from: o0  reason: collision with root package name */
    public FragmentPhotoDisplayBinding f174o0;

    /* renamed from: a5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0005a implements z5.e<Drawable> {
        public C0005a() {
        }

        @Override // z5.e
        public boolean b(Drawable drawable, Object obj, g<Drawable> gVar, DataSource dataSource, boolean z10) {
            a.this.f174o0.d.setVisibility(4);
            return false;
        }

        @Override // z5.e
        public boolean l(GlideException glideException, Object obj, g<Drawable> gVar, boolean z10) {
            kf.a.f12078a.d(glideException, "Error loading user avatar", new Object[0]);
            return false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f174o0 = FragmentPhotoDisplayBinding.bind(layoutInflater.inflate(R.layout.fragment_photo_display, viewGroup, false));
        String string = this.f2019u.getString("photo_url");
        if (TextUtils.isEmpty(string)) {
            ((ImageView) this.f174o0.f4642c.f4698a.findViewById(R.id.error_segment_image)).setImageResource(t3.o.g(UsersConfig.Companion.isGay(this.f173n0.a())));
            this.f174o0.f4642c.f4698a.setVisibility(0);
            this.f174o0.d.setVisibility(4);
            ((TextView) this.f174o0.f4642c.f4698a.findViewById(R.id.error_txtError)).setText(I(R.string.error_default));
        } else {
            com.bumptech.glide.b.c(q()).g(this).o(string).B(new C0005a()).A(this.f174o0.f4641b);
        }
        return this.f174o0.f4640a;
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.f174o0 = null;
        this.U = true;
    }
}
