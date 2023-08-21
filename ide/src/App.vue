<template>
  <q-layout
    view="lhh LpR lff"
    container
    style="height: 100vh" 
    class="shadow-2 rounded-borders"
    :class="$q.dark.isActive ? 'bg-grey-9' : 'bg-grey-3'"
  >
    <q-header reveal :class="$q.dark.isActive ? 'bg-secondary' : 'bg-black'">
      <Toolbar
        :filename="file?.label"
        @new-file="newFile"
        @download-file="downloadFile"
        @save-file="saveFile"
        @copy="copy"
        @paste="paste"
        @select="select"
      />
    </q-header>

    <q-drawer
      side="right"
      v-model="drawerRight"
      bordered
      :width="200"
      :breakpoint="500"
    >
      <q-scroll-area class="fit">
        <DirectoryTree :diretorios="files" @open-file="openFile"/>
      </q-scroll-area>
    </q-drawer>

    <q-page-container>
      <q-page class="q-md">
        <FileEditor :file="file" ref="editor" />
      </q-page>
      
      <q-page-scroller position="bottom">
        <q-btn fab icon="keyboard_arrow_up" color="red" />
      </q-page-scroller>
    </q-page-container>
  </q-layout>
</template>

<script>
import { ref } from 'vue';
import Toolbar from './components/ToolBar.vue';
import FileEditor from './components/FileEditor.vue';
import DirectoryTree from './components/DirectoryTree.vue';
export default {
  name: 'LayoutDefault',

  components: {
    Toolbar,
    FileEditor,
    DirectoryTree,
  },
  setup () {
    return {
      leftDrawerOpen: ref(true),
      drawerLeft: ref(true),
      drawerRight: ref(true),
      file: ref(null),
      files: ref([]),
    }
  },
  methods: {
    save () {
      localStorage.setItem('ide-folders', JSON.stringify(this.files));
    },
    saveFile() {
      this.files.find(f => f.label === this.file.label).content = this.$refs.editor.code;
      this.save();
    },
    load() {
      this.files = JSON.parse(localStorage.getItem('ide-folders')) ?? [];
    },
    openFile(filename) {
      this.file = this.files.find(f => f.label === filename);
    },
    newFile(){
      const file = {
        label: new Date().getTime()+'.isi',
        icon: 'description',
        creationDate: new Date(),
        modificationDate: new Date(),
        content: `programa\n\tdeclare greeting como TEXTO.\n\tgreeting := "Olá Mundo".\n\tescreva(greeting).\nfimprog.`
      };
      this.file = file;
      this.files.push(file);
      this.save()
    },
    
    async downloadFile(){
      await window.chooseFileSystemEntries({ type: "save-file" });
    },
    copy(){},
    paste(){},
    select(){},
  },
  mounted () {
    this.load()
  }
}
</script>
