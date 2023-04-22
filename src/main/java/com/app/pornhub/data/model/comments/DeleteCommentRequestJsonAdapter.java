package com.app.pornhub.data.model.comments;

import android.support.v4.media.a;
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

@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/app/pornhub/data/model/comments/DeleteCommentRequestJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/comments/DeleteCommentRequest;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DeleteCommentRequestJsonAdapter extends f<DeleteCommentRequest> {
    private final JsonReader.a options;
    private final f<String> stringAdapter;

    public DeleteCommentRequestJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("itemId", "type");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"itemId\", \"type\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "itemId", "moshi.adapter(String::cl…ptySet(),\n      \"itemId\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public DeleteCommentRequest fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        String str = null;
        String str2 = null;
        while (reader.h()) {
            int F = reader.F(this.options);
            if (F == -1) {
                reader.P();
                reader.S();
            } else if (F == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    JsonDataException n = c.n("itemId", "itemId", reader);
                    Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"itemId\",…        \"itemId\", reader)");
                    throw n;
                }
            } else if (F == 1 && (str2 = this.stringAdapter.fromJson(reader)) == null) {
                JsonDataException n10 = c.n("type", "type", reader);
                Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"type\", \"type\",\n            reader)");
                throw n10;
            }
        }
        reader.e();
        if (str == null) {
            JsonDataException h10 = c.h("itemId", "itemId", reader);
            Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"itemId\", \"itemId\", reader)");
            throw h10;
        } else if (str2 != null) {
            return new DeleteCommentRequest(str, str2);
        } else {
            JsonDataException h11 = c.h("type", "type", reader);
            Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"type\", \"type\", reader)");
            throw h11;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, DeleteCommentRequest deleteCommentRequest) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(deleteCommentRequest, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("itemId");
        this.stringAdapter.toJson(writer, (j) deleteCommentRequest.getItemId());
        writer.i("type");
        this.stringAdapter.toJson(writer, (j) deleteCommentRequest.getType());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(DeleteCommentRequest)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(DeleteCommentRequest)";
    }
}
