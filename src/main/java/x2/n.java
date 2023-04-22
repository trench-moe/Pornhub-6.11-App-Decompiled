package x2;

import com.app.pornhub.data.model.channels.ChannelListResponse;
import com.app.pornhub.data.model.channels.ChannelModel;
import com.app.pornhub.data.model.dvds.DvdListResponse;
import com.app.pornhub.data.model.gifs.RelatedGifsResponse;
import com.app.pornhub.data.model.photo.UserAlbumsResponse;
import com.app.pornhub.data.model.user.UserResponse;
import com.app.pornhub.data.model.videos.RelatedVideosResponse;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.channel.ChannelListContainer;
import com.app.pornhub.view.login.LoginFragment;
import com.app.pornhub.view.login.SignupActivity;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17812c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17813f;

    public /* synthetic */ n(Object obj, int i10) {
        this.f17812c = i10;
        this.f17813f = obj;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        List list;
        switch (this.f17812c) {
            case 0:
                o this$0 = (o) this.f17813f;
                ChannelListResponse channelListResponse = (ChannelListResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(channelListResponse, "it");
                s2.a aVar = this$0.f17820b;
                Objects.requireNonNull(aVar);
                Intrinsics.checkNotNullParameter(channelListResponse, "channelListResponse");
                List<ChannelModel> channels = channelListResponse.getChannels();
                if (channels == null) {
                    list = null;
                } else {
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(channels, 10));
                    for (ChannelModel channelModel : channels) {
                        arrayList.add(aVar.e(channelModel));
                    }
                    list = arrayList;
                }
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                Map<String, String> orders = channelListResponse.getOrders();
                if (orders == null) {
                    orders = MapsKt.emptyMap();
                }
                return new ChannelListContainer(list, orders);
            case 1:
                n0 this$02 = (n0) this.f17813f;
                DvdListResponse it = (DvdListResponse) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                return this$02.f17815b.i(it);
            case 2:
                r0 this$03 = (r0) this.f17813f;
                RelatedGifsResponse it2 = (RelatedGifsResponse) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                return this$03.f17843b.k(it2.getRelatedGifs());
            case 3:
                x0 this$04 = (x0) this.f17813f;
                UserAlbumsResponse it3 = (UserAlbumsResponse) obj;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                Intrinsics.checkNotNullParameter(it3, "it");
                return this$04.f17885b.b(it3.getUserAlbums());
            case 4:
                m1 this$05 = (m1) this.f17813f;
                UserResponse it4 = (UserResponse) obj;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullParameter(it4, "it");
                if (it4.getUser() != null) {
                    return this$05.f17811c.r(it4.getUser());
                }
                if (it4.getError() != null) {
                    throw new PornhubException(it4.getError().getCode(), it4.getError().getMessage());
                }
                throw new PornhubException(115, "Couldn't obtain user data nor threw any meaningful exception. UserResponse object didn't contain any of expected data elements.");
            case 5:
                s1 this$06 = (s1) this.f17813f;
                RelatedVideosResponse it5 = (RelatedVideosResponse) obj;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Intrinsics.checkNotNullParameter(it5, "it");
                if (it5.getError() == null) {
                    return this$06.d.v(it5.getRelatedVideos());
                }
                throw new PornhubException(it5.getError().getCode(), it5.getError().getMessage());
            case 6:
                CharSequence charSequence = (CharSequence) obj;
                String trim = ((LoginFragment) this.f17813f).f5389r0.f4609f.getText().toString().trim();
                boolean z10 = false;
                if (!trim.isEmpty() && trim.length() >= 6 && trim.length() <= 40) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int i10 = SignupActivity.S;
                return Boolean.valueOf(((SignupActivity) this.f17813f).J());
        }
    }
}
