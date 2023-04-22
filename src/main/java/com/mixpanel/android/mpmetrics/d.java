package com.mixpanel.android.mpmetrics;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final String f8241c;

    /* renamed from: f  reason: collision with root package name */
    public final JSONObject f8242f;

    /* renamed from: j  reason: collision with root package name */
    public final SelectorEvaluator f8243j;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(Parcel parcel) {
        JSONObject jSONObject;
        this.f8241c = parcel.readString();
        try {
            jSONObject = new JSONObject(parcel.readString());
        } catch (JSONException e10) {
            cb.e.D("MixpanelAPI.DisplayTrigger", "Error parsing selector from display_trigger", e10);
            jSONObject = null;
        }
        this.f8242f = jSONObject;
        this.f8243j = jSONObject != null ? new SelectorEvaluator(jSONObject) : null;
    }

    public d(JSONObject jSONObject) {
        try {
            this.f8241c = jSONObject.getString("event");
            JSONObject optJSONObject = jSONObject.optJSONObject("selector");
            this.f8242f = optJSONObject;
            this.f8243j = optJSONObject != null ? new SelectorEvaluator(optJSONObject) : null;
        } catch (JSONException e10) {
            throw new BadDecideObjectException("Event triggered notification JSON was unexpected or bad", e10);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8241c);
        parcel.writeString(this.f8242f.toString());
    }
}
