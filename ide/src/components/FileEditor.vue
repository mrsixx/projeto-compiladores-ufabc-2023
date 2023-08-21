<template>
  <VueCodemirror
    border
    v-model:value="code"
    :options="cmOptions"
    placeholder="test placeholder"
    :height="window.innerHeight - 32"
    @change="change"
  />
</template>

<script>
import {VueCodemirror} from "codemirror-editor-vue3";

// placeholder
import "codemirror/addon/display/placeholder.js";
// language
import '../static/isilanguage.js';
// placeholder
import "codemirror/addon/display/placeholder.js";
// theme
import "codemirror/theme/dracula.css";

import { ref } from "vue";
export default {
  name: 'FileEditor',
  components: { VueCodemirror },
  props: {
    file: {
      type: Object,
    }
  },
  watch: {
    file(obj) {
        this.code = obj.content;
        console.log(obj);
      },
  },
  setup() {
    const code = ref(null);

    return {
      code,
      cmOptions: {
        mode: "isilanguage", // Language mode
        theme: "dracula", // Theme
        indentUnit: 4,
        placeholder: "Digite algum código da IsiLanguage aqui..."
      },
    };
  },
  
};
</script>