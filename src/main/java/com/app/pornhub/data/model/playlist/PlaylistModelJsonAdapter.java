package com.app.pornhub.data.model.playlist;

import android.support.v4.media.a;
import com.app.pornhub.data.model.videos.VideoModel;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.List;
import java.util.Objects;
import jd.j;
import kd.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00180\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012¨\u0006#"}, d2 = {"Lcom/app/pornhub/data/model/playlist/PlaylistModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/playlist/PlaylistModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "longAdapter", "Lcom/squareup/moshi/f;", "stringAdapter", BuildConfig.FLAVOR, "intAdapter", BuildConfig.FLAVOR, "booleanAdapter", BuildConfig.FLAVOR, "listOfStringAdapter", "Lcom/app/pornhub/data/model/playlist/PlaylistThumbsModel;", "listOfPlaylistThumbsModelAdapter", "nullableListOfStringAdapter", "Lcom/app/pornhub/data/model/videos/VideoModel;", "nullableListOfVideoModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class PlaylistModelJsonAdapter extends f<PlaylistModel> {
    private final f<Boolean> booleanAdapter;
    private final f<Integer> intAdapter;
    private final f<List<PlaylistThumbsModel>> listOfPlaylistThumbsModelAdapter;
    private final f<List<String>> listOfStringAdapter;
    private final f<Long> longAdapter;
    private final f<List<String>> nullableListOfStringAdapter;
    private final f<List<VideoModel>> nullableListOfVideoModelAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public PlaylistModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("id", "userId", "username", "title", "description", "status", "percent", "videoCount", "favouriteCount", "views", "premium", "segment", "isFull", "type", "tags", "urlThumbnails", "playlistVkeys", SearchSuggestionsConfig.sourceVideos);
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"id\", \"userId\", \"user…playlistVkeys\", \"videos\")");
        this.options = a10;
        this.longAdapter = a.d(moshi, Long.TYPE, "id", "moshi.adapter(Long::class.java, emptySet(), \"id\")");
        this.stringAdapter = a.d(moshi, String.class, "username", "moshi.adapter(String::cl…ySet(),\n      \"username\")");
        this.intAdapter = a.d(moshi, Integer.TYPE, "percent", "moshi.adapter(Int::class…a, emptySet(), \"percent\")");
        this.booleanAdapter = a.d(moshi, Boolean.TYPE, "premium", "moshi.adapter(Boolean::c…tySet(),\n      \"premium\")");
        this.listOfStringAdapter = a1.a.e(moshi, jd.k.e(List.class, String.class), "tags", "moshi.adapter(Types.newP…emptySet(),\n      \"tags\")");
        this.listOfPlaylistThumbsModelAdapter = a1.a.e(moshi, jd.k.e(List.class, PlaylistThumbsModel.class), "urlThumbnails", "moshi.adapter(Types.newP…tySet(), \"urlThumbnails\")");
        this.nullableListOfStringAdapter = a1.a.e(moshi, jd.k.e(List.class, String.class), "playlistVkeys", "moshi.adapter(Types.newP…),\n      \"playlistVkeys\")");
        this.nullableListOfVideoModelAdapter = a1.a.e(moshi, jd.k.e(List.class, VideoModel.class), SearchSuggestionsConfig.sourceVideos, "moshi.adapter(Types.newP…    emptySet(), \"videos\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public PlaylistModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Long l10 = null;
        Long l11 = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        Boolean bool = null;
        String str = null;
        Boolean bool2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List<String> list = null;
        List<PlaylistThumbsModel> list2 = null;
        List<String> list3 = null;
        List<VideoModel> list4 = null;
        while (true) {
            Boolean bool3 = bool2;
            Boolean bool4 = bool;
            Integer num5 = num4;
            Integer num6 = num3;
            Integer num7 = num2;
            Integer num8 = num;
            String str7 = str4;
            String str8 = str3;
            String str9 = str2;
            String str10 = str;
            Long l12 = l11;
            Long l13 = l10;
            if (!reader.h()) {
                reader.e();
                if (l13 == null) {
                    JsonDataException h10 = c.h("id", "id", reader);
                    Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"id\", \"id\", reader)");
                    throw h10;
                }
                long longValue = l13.longValue();
                if (l12 == null) {
                    JsonDataException h11 = c.h("userId", "userId", reader);
                    Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"userId\", \"userId\", reader)");
                    throw h11;
                }
                long longValue2 = l12.longValue();
                if (str10 == null) {
                    JsonDataException h12 = c.h("username", "username", reader);
                    Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"username\", \"username\", reader)");
                    throw h12;
                } else if (str9 == null) {
                    JsonDataException h13 = c.h("title", "title", reader);
                    Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"title\", \"title\", reader)");
                    throw h13;
                } else if (str8 == null) {
                    JsonDataException h14 = c.h("description", "description", reader);
                    Intrinsics.checkNotNullExpressionValue(h14, "missingProperty(\"descrip…ion\",\n            reader)");
                    throw h14;
                } else if (str7 == null) {
                    JsonDataException h15 = c.h("status", "status", reader);
                    Intrinsics.checkNotNullExpressionValue(h15, "missingProperty(\"status\", \"status\", reader)");
                    throw h15;
                } else if (num8 == null) {
                    JsonDataException h16 = c.h("percent", "percent", reader);
                    Intrinsics.checkNotNullExpressionValue(h16, "missingProperty(\"percent\", \"percent\", reader)");
                    throw h16;
                } else {
                    int intValue = num8.intValue();
                    if (num7 == null) {
                        JsonDataException h17 = c.h("videoCount", "videoCount", reader);
                        Intrinsics.checkNotNullExpressionValue(h17, "missingProperty(\"videoCo…t\", \"videoCount\", reader)");
                        throw h17;
                    }
                    int intValue2 = num7.intValue();
                    if (num6 == null) {
                        JsonDataException h18 = c.h("favouriteCount", "favouriteCount", reader);
                        Intrinsics.checkNotNullExpressionValue(h18, "missingProperty(\"favouri…\"favouriteCount\", reader)");
                        throw h18;
                    }
                    int intValue3 = num6.intValue();
                    if (num5 == null) {
                        JsonDataException h19 = c.h("views", "views", reader);
                        Intrinsics.checkNotNullExpressionValue(h19, "missingProperty(\"views\", \"views\", reader)");
                        throw h19;
                    }
                    int intValue4 = num5.intValue();
                    if (bool4 == null) {
                        JsonDataException h20 = c.h("premium", "premium", reader);
                        Intrinsics.checkNotNullExpressionValue(h20, "missingProperty(\"premium\", \"premium\", reader)");
                        throw h20;
                    }
                    boolean booleanValue = bool4.booleanValue();
                    if (str5 == null) {
                        JsonDataException h21 = c.h("segment", "segment", reader);
                        Intrinsics.checkNotNullExpressionValue(h21, "missingProperty(\"segment\", \"segment\", reader)");
                        throw h21;
                    } else if (bool3 == null) {
                        JsonDataException h22 = c.h("isFull", "isFull", reader);
                        Intrinsics.checkNotNullExpressionValue(h22, "missingProperty(\"isFull\", \"isFull\", reader)");
                        throw h22;
                    } else {
                        boolean booleanValue2 = bool3.booleanValue();
                        if (str6 == null) {
                            JsonDataException h23 = c.h("type", "type", reader);
                            Intrinsics.checkNotNullExpressionValue(h23, "missingProperty(\"type\", \"type\", reader)");
                            throw h23;
                        } else if (list == null) {
                            JsonDataException h24 = c.h("tags", "tags", reader);
                            Intrinsics.checkNotNullExpressionValue(h24, "missingProperty(\"tags\", \"tags\", reader)");
                            throw h24;
                        } else if (list2 != null) {
                            return new PlaylistModel(longValue, longValue2, str10, str9, str8, str7, intValue, intValue2, intValue3, intValue4, booleanValue, str5, booleanValue2, str6, list, list2, list3, list4);
                        } else {
                            JsonDataException h25 = c.h("urlThumbnails", "urlThumbnails", reader);
                            Intrinsics.checkNotNullExpressionValue(h25, "missingProperty(\"urlThum… \"urlThumbnails\", reader)");
                            throw h25;
                        }
                    }
                }
            }
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 0:
                    Long fromJson = this.longAdapter.fromJson(reader);
                    if (fromJson == null) {
                        JsonDataException n = c.n("id", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"id\", \"id\", reader)");
                        throw n;
                    }
                    l10 = fromJson;
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    continue;
                case 1:
                    l11 = this.longAdapter.fromJson(reader);
                    if (l11 == null) {
                        JsonDataException n10 = c.n("userId", "userId", reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"userId\",…rId\",\n            reader)");
                        throw n10;
                    }
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    break;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        JsonDataException n11 = c.n("username", "username", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"username…      \"username\", reader)");
                        throw n11;
                    }
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    l11 = l12;
                    break;
                case 3:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n12 = c.n("title", "title", reader);
                        Intrinsics.checkNotNullExpressionValue(n12, "unexpectedNull(\"title\", …tle\",\n            reader)");
                        throw n12;
                    }
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str = str10;
                    l11 = l12;
                    break;
                case 4:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        JsonDataException n13 = c.n("description", "description", reader);
                        Intrinsics.checkNotNullExpressionValue(n13, "unexpectedNull(\"descript…\", \"description\", reader)");
                        throw n13;
                    }
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 5:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        JsonDataException n14 = c.n("status", "status", reader);
                        Intrinsics.checkNotNullExpressionValue(n14, "unexpectedNull(\"status\",…        \"status\", reader)");
                        throw n14;
                    }
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 6:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        JsonDataException n15 = c.n("percent", "percent", reader);
                        Intrinsics.checkNotNullExpressionValue(n15, "unexpectedNull(\"percent\"…       \"percent\", reader)");
                        throw n15;
                    }
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 7:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        JsonDataException n16 = c.n("videoCount", "videoCount", reader);
                        Intrinsics.checkNotNullExpressionValue(n16, "unexpectedNull(\"videoCou…    \"videoCount\", reader)");
                        throw n16;
                    }
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 8:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        JsonDataException n17 = c.n("favouriteCount", "favouriteCount", reader);
                        Intrinsics.checkNotNullExpressionValue(n17, "unexpectedNull(\"favourit…\"favouriteCount\", reader)");
                        throw n17;
                    }
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 9:
                    num4 = this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        JsonDataException n18 = c.n("views", "views", reader);
                        Intrinsics.checkNotNullExpressionValue(n18, "unexpectedNull(\"views\", …ews\",\n            reader)");
                        throw n18;
                    }
                    bool2 = bool3;
                    bool = bool4;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 10:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        JsonDataException n19 = c.n("premium", "premium", reader);
                        Intrinsics.checkNotNullExpressionValue(n19, "unexpectedNull(\"premium\"…       \"premium\", reader)");
                        throw n19;
                    }
                    bool2 = bool3;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 11:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        JsonDataException n20 = c.n("segment", "segment", reader);
                        Intrinsics.checkNotNullExpressionValue(n20, "unexpectedNull(\"segment\"…       \"segment\", reader)");
                        throw n20;
                    }
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 12:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        JsonDataException n21 = c.n("isFull", "isFull", reader);
                        Intrinsics.checkNotNullExpressionValue(n21, "unexpectedNull(\"isFull\",…        \"isFull\", reader)");
                        throw n21;
                    }
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 13:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        JsonDataException n22 = c.n("type", "type", reader);
                        Intrinsics.checkNotNullExpressionValue(n22, "unexpectedNull(\"type\", \"type\",\n            reader)");
                        throw n22;
                    }
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 14:
                    list = this.listOfStringAdapter.fromJson(reader);
                    if (list == null) {
                        JsonDataException n23 = c.n("tags", "tags", reader);
                        Intrinsics.checkNotNullExpressionValue(n23, "unexpectedNull(\"tags\",\n            \"tags\", reader)");
                        throw n23;
                    }
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 15:
                    list2 = this.listOfPlaylistThumbsModelAdapter.fromJson(reader);
                    if (list2 == null) {
                        JsonDataException n24 = c.n("urlThumbnails", "urlThumbnails", reader);
                        Intrinsics.checkNotNullExpressionValue(n24, "unexpectedNull(\"urlThumb… \"urlThumbnails\", reader)");
                        throw n24;
                    }
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 16:
                    list3 = this.nullableListOfStringAdapter.fromJson(reader);
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                case 17:
                    list4 = this.nullableListOfVideoModelAdapter.fromJson(reader);
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
                default:
                    bool2 = bool3;
                    bool = bool4;
                    num4 = num5;
                    num3 = num6;
                    num2 = num7;
                    num = num8;
                    str4 = str7;
                    str3 = str8;
                    str2 = str9;
                    str = str10;
                    l11 = l12;
                    break;
            }
            l10 = l13;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, PlaylistModel playlistModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(playlistModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("id");
        this.longAdapter.toJson(writer, (j) Long.valueOf(playlistModel.getId()));
        writer.i("userId");
        this.longAdapter.toJson(writer, (j) Long.valueOf(playlistModel.getUserId()));
        writer.i("username");
        this.stringAdapter.toJson(writer, (j) playlistModel.getUsername());
        writer.i("title");
        this.stringAdapter.toJson(writer, (j) playlistModel.getTitle());
        writer.i("description");
        this.stringAdapter.toJson(writer, (j) playlistModel.getDescription());
        writer.i("status");
        this.stringAdapter.toJson(writer, (j) playlistModel.getStatus());
        writer.i("percent");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(playlistModel.getPercent()));
        writer.i("videoCount");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(playlistModel.getVideoCount()));
        writer.i("favouriteCount");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(playlistModel.getFavouriteCount()));
        writer.i("views");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(playlistModel.getViews()));
        writer.i("premium");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(playlistModel.getPremium()));
        writer.i("segment");
        this.stringAdapter.toJson(writer, (j) playlistModel.getSegment());
        writer.i("isFull");
        this.booleanAdapter.toJson(writer, (j) Boolean.valueOf(playlistModel.isFull()));
        writer.i("type");
        this.stringAdapter.toJson(writer, (j) playlistModel.getType());
        writer.i("tags");
        this.listOfStringAdapter.toJson(writer, (j) playlistModel.getTags());
        writer.i("urlThumbnails");
        this.listOfPlaylistThumbsModelAdapter.toJson(writer, (j) playlistModel.getUrlThumbnails());
        writer.i("playlistVkeys");
        this.nullableListOfStringAdapter.toJson(writer, (j) playlistModel.getPlaylistVkeys());
        writer.i(SearchSuggestionsConfig.sourceVideos);
        this.nullableListOfVideoModelAdapter.toJson(writer, (j) playlistModel.getVideos());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(PlaylistModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(PlaylistModel)";
    }
}
