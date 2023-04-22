package x2;

import com.app.pornhub.data.model.categories.CategoriesResponse;
import com.app.pornhub.data.model.dvds.DvdResponse;
import com.app.pornhub.data.model.gifs.GifModel;
import com.app.pornhub.data.model.gifs.MostRecentGifsResponse;
import com.app.pornhub.data.model.user.FriendsResponse;
import com.app.pornhub.data.model.videos.VideosResponse;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.dvd.DvdContainer;
import com.app.pornhub.domain.model.gif.MostRecentGifsContainer;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.view.home.HomeActivityViewModel;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17740c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17741f;

    public /* synthetic */ i(Object obj, int i10) {
        this.f17740c = i10;
        this.f17741f = obj;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        boolean z10 = false;
        switch (this.f17740c) {
            case 0:
                l this$0 = (l) this.f17741f;
                CategoriesResponse categoriesResponse = (CategoriesResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(categoriesResponse, "it");
                if (categoriesResponse.getError() == null) {
                    s2.a aVar = this$0.f17777b;
                    Objects.requireNonNull(aVar);
                    Intrinsics.checkNotNullParameter(categoriesResponse, "categoriesResponse");
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList.addAll(aVar.d(categoriesResponse.getTopCategories()));
                    arrayList2.addAll(aVar.d(categoriesResponse.getAllCategories()));
                    return TuplesKt.to(arrayList, arrayList2);
                }
                throw new PornhubException(categoriesResponse.getError().getCode(), categoriesResponse.getError().getMessage());
            case 1:
                m0 this$02 = (m0) this.f17741f;
                UserMetaData it = (UserMetaData) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                return this$02.u(it);
            case 2:
                n0 this$03 = (n0) this.f17741f;
                DvdResponse dvdResponse = (DvdResponse) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(dvdResponse, "it");
                s2.a aVar2 = this$03.f17815b;
                Objects.requireNonNull(aVar2);
                Intrinsics.checkNotNullParameter(dvdResponse, "dvdResponse");
                return new DvdContainer(aVar2.h(dvdResponse.getDvd()), aVar2.v(dvdResponse.getVideos()));
            case 3:
                r0 this$04 = (r0) this.f17741f;
                MostRecentGifsResponse mostRecentGifsResponse = (MostRecentGifsResponse) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(mostRecentGifsResponse, "it");
                s2.a aVar3 = this$04.f17843b;
                Objects.requireNonNull(aVar3);
                Intrinsics.checkNotNullParameter(mostRecentGifsResponse, "mostRecentGifsResponse");
                List<GifModel> old = mostRecentGifsResponse.getRelatedGifs().getOld();
                if (old == null) {
                    old = CollectionsKt.emptyList();
                }
                List<GifModel> list = mostRecentGifsResponse.getRelatedGifs().getNew();
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                return new MostRecentGifsContainer(aVar3.k(old), aVar3.k(list));
            case 4:
                t0 this$05 = (t0) this.f17741f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                throw this$05.f17861c.a(it2);
            case 5:
                File updateFile = (File) this.f17741f;
                gf.t response = (gf.t) obj;
                Intrinsics.checkNotNullParameter(updateFile, "$updateFile");
                Intrinsics.checkNotNullParameter(response, "response");
                return Observable.create(new e1(response, updateFile, 0));
            case 6:
                m1 this$06 = (m1) this.f17741f;
                FriendsResponse it3 = (FriendsResponse) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3.getError() == null) {
                    return this$06.f17811c.t(it3.getFriends());
                }
                throw new PornhubException(it3.getError().getCode(), it3.getError().getMessage());
            case 7:
                s1 this$07 = (s1) this.f17741f;
                VideosResponse it4 = (VideosResponse) obj;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4.getError() == null) {
                    return this$07.d.v(it4.getVideos());
                }
                throw new PornhubException(it4.getError().getCode(), it4.getError().getMessage());
            default:
                HomeActivityViewModel this$08 = (HomeActivityViewModel) this.f17741f;
                UserOrientation it5 = (UserOrientation) obj;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                Intrinsics.checkNotNullParameter(it5, "it");
                this$08.f5011i.e(it5);
                UserOrientation userOrientation = this$08.n;
                if (!(userOrientation == null)) {
                    if (userOrientation == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("userOrientation");
                        userOrientation = null;
                    }
                    if (!Intrinsics.areEqual(it5, userOrientation)) {
                        z10 = true;
                    }
                }
                this$08.n = it5;
                return Boolean.valueOf(z10);
        }
    }
}
