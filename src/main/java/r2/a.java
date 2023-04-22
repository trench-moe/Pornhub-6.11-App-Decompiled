package r2;

import com.app.pornhub.data.model.categories.CategoryModel;
import com.app.pornhub.data.model.channels.ChannelModel;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.data.model.explore.ExploreOptionsModel;
import com.app.pornhub.data.model.gifs.GifModel;
import com.app.pornhub.data.model.photo.AlbumModel;
import com.app.pornhub.data.model.pornstar.PerformerModel;
import com.app.pornhub.data.model.videos.VideoModel;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final k f14621a;

    public a(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f14621a = moshi;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List<ExploreModel> a(byte[] responseBytes) {
        f fVar;
        List list;
        Intrinsics.checkNotNullParameter(responseBytes, "responseBytes");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONObject(new String(responseBytes, Charsets.UTF_8)).getJSONArray("sections");
        int length = jSONArray.length();
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            String title = jSONObject.optString("title");
            String optString = jSONObject.optString("countryFlag");
            String optString2 = jSONObject.optString("subTitle");
            JSONArray optJSONArray = jSONObject.optJSONArray("list");
            JSONObject optJSONObject = jSONObject.optJSONObject("options");
            String type = jSONObject.optString("type");
            if (!(type == null || type.length() == 0)) {
                Intrinsics.checkNotNullExpressionValue(title, "title");
                Intrinsics.checkNotNullExpressionValue(type, "type");
                switch (type.hashCode()) {
                    case 102340:
                        if (type.equals(ExploreModel.GIF)) {
                            fVar = this.f14621a.b(jd.k.e(List.class, GifModel.class));
                            break;
                        }
                        fVar = null;
                        break;
                    case 50511102:
                        if (type.equals(ExploreModel.CATEGORY)) {
                            fVar = this.f14621a.b(jd.k.e(List.class, CategoryModel.class));
                            break;
                        }
                        fVar = null;
                        break;
                    case 92896879:
                        if (type.equals(ExploreModel.ALBUM)) {
                            fVar = this.f14621a.b(jd.k.e(List.class, AlbumModel.class));
                            break;
                        }
                        fVar = null;
                        break;
                    case 112202875:
                        if (type.equals("video")) {
                            fVar = this.f14621a.b(jd.k.e(List.class, VideoModel.class));
                            break;
                        }
                        fVar = null;
                        break;
                    case 723773773:
                        if (type.equals(ExploreModel.PORNSTAR)) {
                            fVar = this.f14621a.b(jd.k.e(List.class, PerformerModel.class));
                            break;
                        }
                        fVar = null;
                        break;
                    case 738950403:
                        if (type.equals("channel")) {
                            fVar = this.f14621a.b(jd.k.e(List.class, ChannelModel.class));
                            break;
                        }
                        fVar = null;
                        break;
                    default:
                        fVar = null;
                        break;
                }
                if (fVar == null) {
                    list = CollectionsKt.emptyList();
                } else {
                    list = (List) fVar.fromJson(String.valueOf(optJSONArray));
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                }
                String jSONObject2 = optJSONObject == null ? null : optJSONObject.toString();
                arrayList.add(new ExploreModel(title, optString2, optString, type, list, jSONObject2 == null ? null : (ExploreOptionsModel) this.f14621a.a(ExploreOptionsModel.class).fromJson(jSONObject2)));
            }
            i10 = i11;
        }
        return arrayList;
    }
}
