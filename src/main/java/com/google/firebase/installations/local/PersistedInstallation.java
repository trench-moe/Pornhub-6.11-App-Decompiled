package com.google.firebase.installations.local;

import com.google.firebase.installations.local.a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import mb.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PersistedInstallation {

    /* renamed from: a  reason: collision with root package name */
    public final File f8062a;

    /* renamed from: b  reason: collision with root package name */
    public final c f8063b;

    /* loaded from: classes.dex */
    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(c cVar) {
        cVar.a();
        File filesDir = cVar.f13066a.getFilesDir();
        StringBuilder m10 = a1.a.m("PersistedInstallation.");
        m10.append(cVar.c());
        m10.append(".json");
        this.f8062a = new File(filesDir, m10.toString());
        this.f8063b = cVar;
    }

    public b a(b bVar) {
        File createTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.c());
            jSONObject.put("Status", bVar.f().ordinal());
            jSONObject.put("AuthToken", bVar.a());
            jSONObject.put("RefreshToken", bVar.e());
            jSONObject.put("TokenCreationEpochInSecs", bVar.g());
            jSONObject.put("ExpiresInSecs", bVar.b());
            jSONObject.put("FisError", bVar.d());
            c cVar = this.f8063b;
            cVar.a();
            createTempFile = File.createTempFile("PersistedInstallation", "tmp", cVar.f13066a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (createTempFile.renameTo(this.f8062a)) {
            return bVar;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public b b() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(this.f8062a);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        RegistrationStatus registrationStatus = RegistrationStatus.ATTEMPT_MIGRATION;
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i10 = b.f8081a;
        a.b bVar = new a.b();
        bVar.d(0L);
        bVar.b(registrationStatus);
        bVar.c(0L);
        bVar.f8075a = optString;
        bVar.b(RegistrationStatus.values()[optInt]);
        bVar.f8077c = optString2;
        bVar.d = optString3;
        bVar.d(optLong);
        bVar.c(optLong2);
        bVar.f8080g = optString4;
        return bVar.a();
    }
}
