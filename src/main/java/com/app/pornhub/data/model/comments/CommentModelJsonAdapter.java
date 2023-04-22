package com.app.pornhub.data.model.comments;

import android.support.v4.media.a;
import com.app.pornhub.data.model.user.UserModel;
import com.app.pornhub.domain.config.UsersConfig;
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

@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00160\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/app/pornhub/data/model/comments/CommentModelJsonAdapter;", "Lcom/squareup/moshi/f;", "Lcom/app/pornhub/data/model/comments/CommentModel;", BuildConfig.FLAVOR, "toString", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Ljd/j;", "writer", "value_", BuildConfig.FLAVOR, "toJson", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/JsonReader$a;", "stringAdapter", "Lcom/squareup/moshi/f;", BuildConfig.FLAVOR, "longAdapter", "Lcom/app/pornhub/data/model/user/UserModel;", "userModelAdapter", BuildConfig.FLAVOR, "nullableListOfCommentModelAdapter", "Lcom/squareup/moshi/k;", "moshi", "<init>", "(Lcom/squareup/moshi/k;)V", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class CommentModelJsonAdapter extends f<CommentModel> {
    private final f<Long> longAdapter;
    private final f<List<CommentModel>> nullableListOfCommentModelAdapter;
    private final JsonReader.a options;
    private final f<String> stringAdapter;
    private final f<UserModel> userModelAdapter;

    public CommentModelJsonAdapter(k moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.a a10 = JsonReader.a.a("id", "text", "dateAdded", "votesUp", "votesDown", UsersConfig.USER_PREF_KEY, "children");
        Intrinsics.checkNotNullExpressionValue(a10, "of(\"id\", \"text\", \"dateAd…own\", \"user\", \"children\")");
        this.options = a10;
        this.stringAdapter = a.d(moshi, String.class, "id", "moshi.adapter(String::cl…, emptySet(),\n      \"id\")");
        this.longAdapter = a.d(moshi, Long.TYPE, "dateAdded", "moshi.adapter(Long::clas…Set(),\n      \"dateAdded\")");
        this.userModelAdapter = a.d(moshi, UserModel.class, UsersConfig.USER_PREF_KEY, "moshi.adapter(UserModel:…      emptySet(), \"user\")");
        this.nullableListOfCommentModelAdapter = a1.a.e(moshi, jd.k.e(List.class, CommentModel.class), "children", "moshi.adapter(Types.newP…  emptySet(), \"children\")");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.f
    public CommentModel fromJson(JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.c();
        Long l10 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        UserModel userModel = null;
        List<CommentModel> list = null;
        while (reader.h()) {
            switch (reader.F(this.options)) {
                case -1:
                    reader.P();
                    reader.S();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        JsonDataException n = c.n("id", "id", reader);
                        Intrinsics.checkNotNullExpressionValue(n, "unexpectedNull(\"id\", \"id\", reader)");
                        throw n;
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        JsonDataException n10 = c.n("text", "text", reader);
                        Intrinsics.checkNotNullExpressionValue(n10, "unexpectedNull(\"text\", \"text\",\n            reader)");
                        throw n10;
                    }
                    break;
                case 2:
                    l10 = this.longAdapter.fromJson(reader);
                    if (l10 == null) {
                        JsonDataException n11 = c.n("dateAdded", "dateAdded", reader);
                        Intrinsics.checkNotNullExpressionValue(n11, "unexpectedNull(\"dateAdde…     \"dateAdded\", reader)");
                        throw n11;
                    }
                    break;
                case 3:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        JsonDataException n12 = c.n("votesUp", "votesUp", reader);
                        Intrinsics.checkNotNullExpressionValue(n12, "unexpectedNull(\"votesUp\"…       \"votesUp\", reader)");
                        throw n12;
                    }
                    break;
                case 4:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        JsonDataException n13 = c.n("votesDown", "votesDown", reader);
                        Intrinsics.checkNotNullExpressionValue(n13, "unexpectedNull(\"votesDow…     \"votesDown\", reader)");
                        throw n13;
                    }
                    break;
                case 5:
                    userModel = this.userModelAdapter.fromJson(reader);
                    if (userModel == null) {
                        JsonDataException n14 = c.n(UsersConfig.USER_PREF_KEY, UsersConfig.USER_PREF_KEY, reader);
                        Intrinsics.checkNotNullExpressionValue(n14, "unexpectedNull(\"user\", \"user\",\n            reader)");
                        throw n14;
                    }
                    break;
                case 6:
                    list = this.nullableListOfCommentModelAdapter.fromJson(reader);
                    break;
            }
        }
        reader.e();
        if (str == null) {
            JsonDataException h10 = c.h("id", "id", reader);
            Intrinsics.checkNotNullExpressionValue(h10, "missingProperty(\"id\", \"id\", reader)");
            throw h10;
        } else if (str2 == null) {
            JsonDataException h11 = c.h("text", "text", reader);
            Intrinsics.checkNotNullExpressionValue(h11, "missingProperty(\"text\", \"text\", reader)");
            throw h11;
        } else if (l10 == null) {
            JsonDataException h12 = c.h("dateAdded", "dateAdded", reader);
            Intrinsics.checkNotNullExpressionValue(h12, "missingProperty(\"dateAdded\", \"dateAdded\", reader)");
            throw h12;
        } else {
            long longValue = l10.longValue();
            if (str3 == null) {
                JsonDataException h13 = c.h("votesUp", "votesUp", reader);
                Intrinsics.checkNotNullExpressionValue(h13, "missingProperty(\"votesUp\", \"votesUp\", reader)");
                throw h13;
            } else if (str4 == null) {
                JsonDataException h14 = c.h("votesDown", "votesDown", reader);
                Intrinsics.checkNotNullExpressionValue(h14, "missingProperty(\"votesDown\", \"votesDown\", reader)");
                throw h14;
            } else if (userModel != null) {
                return new CommentModel(str, str2, longValue, str3, str4, userModel, list);
            } else {
                JsonDataException h15 = c.h(UsersConfig.USER_PREF_KEY, UsersConfig.USER_PREF_KEY, reader);
                Intrinsics.checkNotNullExpressionValue(h15, "missingProperty(\"user\", \"user\", reader)");
                throw h15;
            }
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(j writer, CommentModel commentModel) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Objects.requireNonNull(commentModel, "value_ was null! Wrap in .nullSafe() to write nullable values.");
        writer.c();
        writer.i("id");
        this.stringAdapter.toJson(writer, (j) commentModel.getId());
        writer.i("text");
        this.stringAdapter.toJson(writer, (j) commentModel.getText());
        writer.i("dateAdded");
        this.longAdapter.toJson(writer, (j) Long.valueOf(commentModel.getDateAdded()));
        writer.i("votesUp");
        this.stringAdapter.toJson(writer, (j) commentModel.getVotesUp());
        writer.i("votesDown");
        this.stringAdapter.toJson(writer, (j) commentModel.getVotesDown());
        writer.i(UsersConfig.USER_PREF_KEY);
        this.userModelAdapter.toJson(writer, (j) commentModel.getUser());
        writer.i("children");
        this.nullableListOfCommentModelAdapter.toJson(writer, (j) commentModel.getChildren());
        writer.f();
    }

    public String toString() {
        Intrinsics.checkNotNullExpressionValue("GeneratedJsonAdapter(CommentModel)", "StringBuilder(capacity).…builderAction).toString()");
        return "GeneratedJsonAdapter(CommentModel)";
    }
}
