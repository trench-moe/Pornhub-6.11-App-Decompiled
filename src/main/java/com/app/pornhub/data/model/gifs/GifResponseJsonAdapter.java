package com.app.pornhub.data.model.gifs;

import android.support.v4.media.a;
import com.app.pornhub.data.model.ErrorModel;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.appsflyer.oaid.BuildConfig;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.util.Objects;
import jd.j;
import kd.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/app/pornhub/data/model/gifs/GifResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/gifs/GifResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "Lcom/app/pornhub/data/model/gifs/GifModel;", "gifModelAdapter", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class GifResponseJsonAdapter extends f<GifResponse> {
    private final f<GifModel> gifModelAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;

    public GifResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a(ExploreModel.GIF, "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"gif\", \"error\")");
        this.options = a10;
        this.gifModelAdapter = a.d(moshi, GifModel.class, ExploreModel.GIF, "moshi.adapter(GifModel::…\n      emptySet(), \"gif\")");
        this.nullableErrorModelAdapter = a.d(moshi, ErrorModel.class, "error", "moshi.adapter(ErrorModel…ava, emptySet(), \"error\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public GifResponse fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        GifModel gifModel = null;
        ErrorModel errorModel = null;
        while (reader.h()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.P();
                reader.S();
            } else if (F == 0) {
                gifModel = this.gifModelAdapter.fromJson(reader);
                if (gifModel == null) {
                    JsonDataException n = c.n(ExploreModel.GIF, ExploreModel.GIF, reader);
                    Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"gif\", \"gif\",\n            reader)");
                    throw n;
                }
            } else if (F == 1) {
                errorModel = this.nullableErrorModelAdapter.fromJson(reader);
            }
        }
        reader.e();
        if (gifModel != null) {
            return new GifResponse(gifModel, errorModel);
        }
        JsonDataException h10 = c.h(ExploreModel.GIF, ExploreModel.GIF, reader);
        Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"gif\", \"gif\", reader)");
        throw h10;
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, GifResponse gifResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(gifResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i(ExploreModel.GIF);
        this.gifModelAdapter.toJson(writer, (j) gifResponse.getGif());
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) gifResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(GifResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(GifResponse)";
    }
}
