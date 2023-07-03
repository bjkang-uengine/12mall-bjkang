import Vue from 'vue';
import Vuetify from 'vuetify/lib/framework';

Vue.use(Vuetify);

const themeColors = {
    surface:'',
    primary: '',
    'primary-darken-1': '',
    secondary: '',
    'secondary-darken-1': '',
    info: '',
    error: '',
    warning: '',
    success: '',
};

const defaultColors = {
    surface: '#FFFFFF',
    primary: '#1976D2',
    'primary-darken-1': '#1565C0',
    secondary: '#424242',
    'secondary-darken-1': '#212121',
    info: '#2196F3',
    error: '#FF5252',
    warning: '#FFC107',
    success: '#4CAF50',
};

Object.keys(themeColors).forEach(key => {
    if (!themeColors[key]) {
        themeColors[key] = defaultColors[key];
    }
});

export default new Vuetify({
    theme: {
        light: true,
        themes: {
            light: themeColors,
        },
    },
});
