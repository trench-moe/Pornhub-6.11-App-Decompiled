package com.app.pornhub.view.editplaylist;

import a1.a;
import androidx.lifecycle.p;
import com.appsflyer.oaid.BuildConfig;
import f3.o;
import j3.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v3.d;

/* loaded from: classes.dex */
public final class EditPlaylistViewModel extends d {

    /* loaded from: classes.dex */
    public static abstract class State {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/editplaylist/EditPlaylistViewModel$State$ErrorSave;", "Lcom/app/pornhub/view/editplaylist/EditPlaylistViewModel$State;", BuildConfig.FLAVOR, "component1", "message", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class ErrorSave extends State {
            private final String message;

            public final String component1() {
                return this.message;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ErrorSave) && Intrinsics.areEqual(this.message, ((ErrorSave) obj).message);
            }

            public int hashCode() {
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a.m("ErrorSave(message=");
                m10.append((Object) this.message);
                m10.append(')');
                return m10.toString();
            }
        }
    }

    public EditPlaylistViewModel(e getPlaylistUseCase, o getUserSettingsUseCase) {
        Intrinsics.checkNotNullParameter(getPlaylistUseCase, "getPlaylistUseCase");
        Intrinsics.checkNotNullParameter(getUserSettingsUseCase, "getUserSettingsUseCase");
        new p();
    }
}
