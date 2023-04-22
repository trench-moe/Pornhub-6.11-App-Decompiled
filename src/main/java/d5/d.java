package d5;

import a5.e;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d0;
import androidx.fragment.app.y;
import androidx.navigation.n;
import com.app.pornhub.NavHomeDirections;
import com.app.pornhub.R;
import com.app.pornhub.view.home.albums.AlbumsFragment;
import com.app.pornhub.view.home.albums.Type;
import com.app.pornhub.view.photos.PhotosType;
import com.appsflyer.oaid.BuildConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class d extends d0 {

    /* renamed from: h  reason: collision with root package name */
    public String f8775h;

    /* renamed from: i  reason: collision with root package name */
    public Context f8776i;

    public d(Context context, y yVar, String str) {
        super(yVar);
        this.f8775h = str;
        this.f8776i = context.getApplicationContext();
    }

    @Override // y1.a
    public int e() {
        return 2;
    }

    @Override // y1.a
    public CharSequence f(int i10) {
        return i10 != 0 ? i10 != 1 ? BuildConfig.FLAVOR : this.f8776i.getString(R.string.favorites) : this.f8776i.getString(R.string.albums);
    }

    @Override // androidx.fragment.app.d0
    public Fragment m(int i10) {
        Bundle bundle = new Bundle();
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            bundle.putSerializable("photos_type", PhotosType.FAVORITES);
            bundle.putString("target_user_id", this.f8775h);
            e eVar = new e();
            eVar.A0(bundle);
            return eVar;
        }
        Type type = Type.USER;
        String userId = this.f8775h;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(userId, "userId");
        n b10 = NavHomeDirections.f4266a.b(type, userId);
        AlbumsFragment albumsFragment = new AlbumsFragment();
        albumsFragment.A0(b10.getArguments());
        return albumsFragment;
    }
}
