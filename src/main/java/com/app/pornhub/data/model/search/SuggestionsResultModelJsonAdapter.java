package com.app.pornhub.data.model.search;

import a1.a;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.List;
import java.util.Objects;
import jd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/app/pornhub/data/model/search/SuggestionsResultModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/search/SuggestionsResultModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "nullableListOfStringAdapter", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/search/SuggestionItemModel;", "nullableListOfSuggestionItemModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SuggestionsResultModelJsonAdapter extends f<SuggestionsResultModel> {
    private final f<List<String>> nullableListOfStringAdapter;
    private final f<List<SuggestionItemModel>> nullableListOfSuggestionItemModelAdapter;
    private final JsonReader.a options;

    public SuggestionsResultModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a(SearchSuggestionsConfig.sourcePornstars, SearchSuggestionsConfig.sourceVideos, SearchSuggestionsConfig.sourceGifs, SearchSuggestionsConfig.sourcePhotos, SearchSuggestionsConfig.sourceMembers, "pornstar_suggestions", "channel_suggestions");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"pornstars\", \"videos\"…\", \"channel_suggestions\")");
        this.options = a10;
        this.nullableListOfStringAdapter = a.e(moshi, jd.k.e(List.class, String.class), SearchSuggestionsConfig.sourcePornstars, "moshi.adapter(Types.newP…Set(),\n      \"pornstars\")");
        this.nullableListOfSuggestionItemModelAdapter = a.e(moshi, jd.k.e(List.class, SuggestionItemModel.class), "pornstarSuggestions", "moshi.adapter(Types.newP…), \"pornstarSuggestions\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public SuggestionsResultModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        List<String> list = null;
        List<String> list2 = null;
        List<String> list3 = null;
        List<String> list4 = null;
        List<String> list5 = null;
        List<SuggestionItemModel> list6 = null;
        List<SuggestionItemModel> list7 = null;
        while (reader.h()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    break;
                case 0:
                    list = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 1:
                    list2 = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 2:
                    list3 = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 3:
                    list4 = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 4:
                    list5 = this.nullableListOfStringAdapter.fromJson(reader);
                    break;
                case 5:
                    list6 = this.nullableListOfSuggestionItemModelAdapter.fromJson(reader);
                    break;
                case 6:
                    list7 = this.nullableListOfSuggestionItemModelAdapter.fromJson(reader);
                    break;
            }
        }
        reader.e();
        return new SuggestionsResultModel(list, list2, list3, list4, list5, list6, list7);
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, SuggestionsResultModel suggestionsResultModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(suggestionsResultModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i(SearchSuggestionsConfig.sourcePornstars);
        this.nullableListOfStringAdapter.toJson(writer, (j) suggestionsResultModel.getPornstars());
        writer.i(SearchSuggestionsConfig.sourceVideos);
        this.nullableListOfStringAdapter.toJson(writer, (j) suggestionsResultModel.getVideos());
        writer.i(SearchSuggestionsConfig.sourceGifs);
        this.nullableListOfStringAdapter.toJson(writer, (j) suggestionsResultModel.getGifs());
        writer.i(SearchSuggestionsConfig.sourcePhotos);
        this.nullableListOfStringAdapter.toJson(writer, (j) suggestionsResultModel.getPhotos());
        writer.i(SearchSuggestionsConfig.sourceMembers);
        this.nullableListOfStringAdapter.toJson(writer, (j) suggestionsResultModel.getMembers());
        writer.i("pornstar_suggestions");
        this.nullableListOfSuggestionItemModelAdapter.toJson(writer, (j) suggestionsResultModel.getPornstarSuggestions());
        writer.i("channel_suggestions");
        this.nullableListOfSuggestionItemModelAdapter.toJson(writer, (j) suggestionsResultModel.getChannelSuggestions());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(SuggestionsResultModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(SuggestionsResultModel)";
    }
}
