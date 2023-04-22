#extension GL_OES_EGL_image_external : require
precision highp float;

uniform int eye;
uniform int stereoType;
uniform samplerExternalOES sampler;

varying vec3 vDir;

#define PI 3.1415926535897932384626433832795

vec4 getColor(vec3 direction, int eye) {
    highp float phi = atan(direction.x, -direction.z);
    highp float theta = atan(direction.y, length(direction.xz));

    if (abs(phi) > PI * 0.5) {
        return vec4(0.0, 0.0, 0.0, 1.0);
    }

    highp float invPi = 1.0 / PI;

    highp float X = phi * invPi + 0.5;
    highp float Y = theta * invPi + 0.5;

    if (stereoType == 1) {
        X = (X + float(eye - 1)) * 0.5;
    } else if (stereoType == 2) {
        Y = (Y + float(eye - 1)) * 0.5;
    } else if (stereoType == 3) {
        X = (X + float(2 - eye)) * 0.5;
    } else if (stereoType == 4) {
        Y = (Y + float(2 - eye)) * 0.5;
    }

    return texture2D(sampler, vec2(X, 1.0 - Y));
}

void main(void) {
    gl_FragColor = getColor(vDir, eye);
}