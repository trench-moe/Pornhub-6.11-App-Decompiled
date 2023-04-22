package com.app.pornhub.data.model.playlist;

import android.support.v4.media.a;
import com.app.pornhub.data.model.ErrorModel;
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

@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/app/pornhub/data/model/playlist/CreatePlaylistResponseJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/playlist/CreatePlaylistResponse;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", BuildConfig.FLAVOR, "intAdapter", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/ErrorModel;", "nullableErrorModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class CreatePlaylistResponseJsonAdapter extends f<CreatePlaylistResponse> {
    private final f<Integer> intAdapter;
    private final f<ErrorModel> nullableErrorModelAdapter;
    private final JsonReader.a options;

    public CreatePlaylistResponseJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("playlistId", "error");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"playlistId\", \"error\")");
        this.options = a10;
        this.intAdapter = a.d(moshi, Integer.TYPE, "playlistId", "moshi.adapter(Int::class…et(),\n      \"playlistId\")");
        this.nullableErrorModelAdapter = a.d(moshi, ErrorModel.class, "error", "moshi.adapter(ErrorModel…ava, emptySet(), \"error\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public CreatePlaylistResponse fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Integer num = null;
        ErrorModel errorModel = null;
        while (reader.h()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.P();
                reader.S();
            } else if (F == 0) {
                num = this.intAdapter.fromJson(reader);
                if (num == null) {
                    JsonDataException n = c.n("playlistId", "playlistId", reader);
                    Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"playlist…    \"playlistId\", reader)");
                    throw n;
                }
            } else if (F == 1) {
                errorModel = this.nullableErrorModelAdapter.fromJson(reader);
            }
        }
        reader.e();
        if (num != null) {
            return new CreatePlaylistResponse(num.intValue(), errorModel);
        }
        JsonDataException h10 = c.h("playlistId", "playlistId", reader);
        Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"playlis…d\", \"playlistId\", reader)");
        throw h10;
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, CreatePlaylistResponse createPlaylistResponse) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(createPlaylistResponse, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("playlistId");
        this.intAdapter.toJson(writer, (j) Integer.valueOf(createPlaylistResponse.getPlaylistId()));
        writer.i("error");
        this.nullableErrorModelAdapter.toJson(writer, (j) createPlaylistResponse.getError());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(CreatePlaylistResponse)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(CreatePlaylistResponse)";
    }
}
