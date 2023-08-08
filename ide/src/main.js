import { createApp } from 'vue'
import App from './App.vue'
import { Quasar } from 'quasar'
import quasarUserOptions from './quasar-user-options'
import { InstallCodemirro } from "codemirror-editor-vue3";
const app = createApp(App)
.use(Quasar, quasarUserOptions)
.use(InstallCodemirro, { componentName: "customName" });
app.config.globalProperties.window = window;
app.mount('#app')

