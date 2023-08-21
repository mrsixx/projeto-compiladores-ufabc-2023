import { CodeMirror } from "codemirror-editor-vue3";
/* Example definition of a simple mode that understands a subset of
 * IsiLanguage:
 */

CodeMirror.defineSimpleMode("isilanguage", {
  start: [
    { regex: /"(?:[^\\]|\\.)*?(?:"|$)/, token: "string" },
    { regex: /[0-9]+/, token: "number" },
    { regex: /declare|como|leia|escreva|senao|se|entao|paratodo|em|enquanto|e|ou/, token: "keyword" },
    { regex: /programa/, token: "keyword", indent: true },
    { regex: /fimprog/, token: "keyword", dedent: true },
    { regex: /INTEIRO|TEXTO|DECIMAL/, token: "atom" },
    { regex: /[a-zA-Z]\w*/, token: "variable" },
    { regex: /[-+/*:=<>!]+/, token: "operator" },
    { regex: /{/, indent: true },
    { regex: /}/, dedent: true },
    { regex: /\/\/.*/, token: "comment" },
    { regex: /\/\*/, token: "comment", next: "comment" },
  ],
  comment: [
    { regex: /.*?\*\//, token: "comment", next: "start" },
    { regex: /.*/, token: "comment" },
  ],
  meta: {
    dontIndentStates: ["comment"],
    lineComment: "//",
  },
});

// Carregue o modo
CodeMirror.defineMIME("text/isilanguage", "isilanguage");