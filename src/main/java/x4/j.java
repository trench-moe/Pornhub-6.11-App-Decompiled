package x4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.app.pornhub.R;
import z2.cp;

/* loaded from: classes2.dex */
public class j extends Fragment implements cp {

    /* renamed from: p0  reason: collision with root package name */
    public static final String f17944p0 = j.class.getSimpleName();

    /* renamed from: n0  reason: collision with root package name */
    public f3.g f17945n0;

    /* renamed from: o0  reason: collision with root package name */
    public q3.d f17946o0;

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_offline_videos_premium_expired, viewGroup, false);
        inflate.findViewById(R.id.login).setOnClickListener(new u3.a(this, 16));
        inflate.findViewById(R.id.button_get_premium).setOnClickListener(new b4.b(this, 14));
        t3.a.x(q(), "Home", "OfflineVideosPremiumExpired");
        return inflate;
    }
}
