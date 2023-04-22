#extension GL_OES_EGL_image_external : require
precision highp float;

uniform int eye;
uniform int stereoType;
uniform samplerExternalOES sampler;

varying vec3 vDir;

#define PI 3.1415926535897932384626433832795

vec4 getColor(vec3 direction, int eye) {
    float phi = atan(length(direction.xy), -direction.z);

    if (phi > PI / 2.0) {
        return vec4(0.0, 0.0, 0.0, 1.0);
    }

    float theta = atan(direction.y, direction.x);

    float R = phi / PI;
    float X = R * cos(theta) + 0.5;
    float Y = R * sin(theta) + 0.5;

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