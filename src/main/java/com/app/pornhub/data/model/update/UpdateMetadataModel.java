package com.app.pornhub.data.model.update;

import a1.a;
import android.support.v4.media.b;
import androidx.databinding.ViewDataBinding;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import jd.f;
import jd.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@g(generateAdapter = ViewDataBinding.f1896i)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0002\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0011HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0006HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J²\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0003\u0010\u000f\u001a\u00020\u00062\b\b\u0003\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0013\u001a\u00020\u00112\b\b\u0003\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020\u00112\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0003HÖ\u0001J\t\u0010?\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001a¨\u0006@"}, d2 = {"Lcom/app/pornhub/data/model/update/UpdateMetadataModel;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "appId", AppMeasurementSdk.ConditionalUserProperty.NAME, BuildConfig.FLAVOR, "checksum", "versionCode", "versionName", "lenght", BuildConfig.FLAVOR, "url", "sdk", "extras", "creationTime", "isMandatory", BuildConfig.FLAVOR, "changelog", "isValidated", "validationTime", "updated", "(IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAppId", "()I", "getChangelog", "()Ljava/lang/String;", "getChecksum", "getCreationTime", "getExtras", "getId", "()Z", "getLenght", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "getSdk", "getUpdated", "getUrl", "getValidationTime", "getVersionCode", "getVersionName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/app/pornhub/data/model/update/UpdateMetadataModel;", "equals", "other", "hashCode", "toString", "data_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UpdateMetadataModel {
    private final int appId;
    private final String changelog;
    private final String checksum;
    private final String creationTime;
    private final String extras;

    /* renamed from: id  reason: collision with root package name */
    private final int f4348id;
    private final boolean isMandatory;
    private final boolean isValidated;
    private final Long lenght;
    private final String name;
    private final int sdk;
    private final String updated;
    private final String url;
    private final String validationTime;
    private final int versionCode;
    private final String versionName;

    public UpdateMetadataModel(int i10, @f(name = "application_id") int i11, String name, String checksum, @f(name = "version_code") int i12, @f(name = "version_name") String versionName, Long l10, String url, int i13, String extras, @f(name = "creation_time") String creationTime, @f(name = "mandatory") boolean z10, String str, @f(name = "validated") boolean z11, @f(name = "validation_time") String validationTime, String updated) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(checksum, "checksum");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(creationTime, "creationTime");
        Intrinsics.checkNotNullParameter(validationTime, "validationTime");
        Intrinsics.checkNotNullParameter(updated, "updated");
        this.f4348id = i10;
        this.appId = i11;
        this.name = name;
        this.checksum = checksum;
        this.versionCode = i12;
        this.versionName = versionName;
        this.lenght = l10;
        this.url = url;
        this.sdk = i13;
        this.extras = extras;
        this.creationTime = creationTime;
        this.isMandatory = z10;
        this.changelog = str;
        this.isValidated = z11;
        this.validationTime = validationTime;
        this.updated = updated;
    }

    public final int component1() {
        return this.f4348id;
    }

    public final String component10() {
        return this.extras;
    }

    public final String component11() {
        return this.creationTime;
    }

    public final boolean component12() {
        return this.isMandatory;
    }

    public final String component13() {
        return this.changelog;
    }

    public final boolean component14() {
        return this.isValidated;
    }

    public final String component15() {
        return this.validationTime;
    }

    public final String component16() {
        return this.updated;
    }

    public final int component2() {
        return this.appId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.checksum;
    }

    public final int component5() {
        return this.versionCode;
    }

    public final String component6() {
        return this.versionName;
    }

    public final Long component7() {
        return this.lenght;
    }

    public final String component8() {
        return this.url;
    }

    public final int component9() {
        return this.sdk;
    }

    public final UpdateMetadataModel copy(int i10, @f(name = "application_id") int i11, String name, String checksum, @f(name = "version_code") int i12, @f(name = "version_name") String versionName, Long l10, String url, int i13, String extras, @f(name = "creation_time") String creationTime, @f(name = "mandatory") boolean z10, String str, @f(name = "validated") boolean z11, @f(name = "validation_time") String validationTime, String updated) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(checksum, "checksum");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(creationTime, "creationTime");
        Intrinsics.checkNotNullParameter(validationTime, "validationTime");
        Intrinsics.checkNotNullParameter(updated, "updated");
        return new UpdateMetadataModel(i10, i11, name, checksum, i12, versionName, l10, url, i13, extras, creationTime, z10, str, z11, validationTime, updated);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateMetadataModel) {
            UpdateMetadataModel updateMetadataModel = (UpdateMetadataModel) obj;
            return this.f4348id == updateMetadataModel.f4348id && this.appId == updateMetadataModel.appId && Intrinsics.areEqual(this.name, updateMetadataModel.name) && Intrinsics.areEqual(this.checksum, updateMetadataModel.checksum) && this.versionCode == updateMetadataModel.versionCode && Intrinsics.areEqual(this.versionName, updateMetadataModel.versionName) && Intrinsics.areEqual(this.lenght, updateMetadataModel.lenght) && Intrinsics.areEqual(this.url, updateMetadataModel.url) && this.sdk == updateMetadataModel.sdk && Intrinsics.areEqual(this.extras, updateMetadataModel.extras) && Intrinsics.areEqual(this.creationTime, updateMetadataModel.creationTime) && this.isMandatory == updateMetadataModel.isMandatory && Intrinsics.areEqual(this.changelog, updateMetadataModel.changelog) && this.isValidated == updateMetadataModel.isValidated && Intrinsics.areEqual(this.validationTime, updateMetadataModel.validationTime) && Intrinsics.areEqual(this.updated, updateMetadataModel.updated);
        }
        return false;
    }

    public final int getAppId() {
        return this.appId;
    }

    public final String getChangelog() {
        return this.changelog;
    }

    public final String getChecksum() {
        return this.checksum;
    }

    public final String getCreationTime() {
        return this.creationTime;
    }

    public final String getExtras() {
        return this.extras;
    }

    public final int getId() {
        return this.f4348id;
    }

    public final Long getLenght() {
        return this.lenght;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSdk() {
        return this.sdk;
    }

    public final String getUpdated() {
        return this.updated;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getValidationTime() {
        return this.validationTime;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = a.b(this.versionName, (a.b(this.checksum, a.b(this.name, ((this.f4348id * 31) + this.appId) * 31, 31), 31) + this.versionCode) * 31, 31);
        Long l10 = this.lenght;
        int i10 = 0;
        int b11 = a.b(this.creationTime, a.b(this.extras, (a.b(this.url, (b10 + (l10 == null ? 0 : l10.hashCode())) * 31, 31) + this.sdk) * 31, 31), 31);
        boolean z10 = this.isMandatory;
        int i11 = 1;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        int i13 = (b11 + i12) * 31;
        String str = this.changelog;
        if (str != null) {
            i10 = str.hashCode();
        }
        int i14 = (i13 + i10) * 31;
        boolean z11 = this.isValidated;
        if (!z11) {
            i11 = z11 ? 1 : 0;
        }
        return this.updated.hashCode() + a.b(this.validationTime, (i14 + i11) * 31, 31);
    }

    public final boolean isMandatory() {
        return this.isMandatory;
    }

    public final boolean isValidated() {
        return this.isValidated;
    }

    public String toString() {
        StringBuilder m10 = a.m("UpdateMetadataModel(id=");
        m10.append(this.f4348id);
        m10.append(", appId=");
        m10.append(this.appId);
        m10.append(", name=");
        m10.append(this.name);
        m10.append(", checksum=");
        m10.append(this.checksum);
        m10.append(", versionCode=");
        m10.append(this.versionCode);
        m10.append(", versionName=");
        m10.append(this.versionName);
        m10.append(", lenght=");
        m10.append(this.lenght);
        m10.append(", url=");
        m10.append(this.url);
        m10.append(", sdk=");
        m10.append(this.sdk);
        m10.append(", extras=");
        m10.append(this.extras);
        m10.append(", creationTime=");
        m10.append(this.creationTime);
        m10.append(", isMandatory=");
        m10.append(this.isMandatory);
        m10.append(", changelog=");
        m10.append((Object) this.changelog);
        m10.append(", isValidated=");
        m10.append(this.isValidated);
        m10.append(", validationTime=");
        m10.append(this.validationTime);
        m10.append(", updated=");
        return b.l(m10, this.updated, ')');
    }
}
