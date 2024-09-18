using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class LunarModuleController : MonoBehaviour
{
    public float speed = 5f;
    private Rigidbody2D rb;
    private bool isLanding = false;
    private bool isOnGround = true;
    private AudioClip chrashSound;
    private AudioClip landingSound;
    private AudioSource audiosource;

    void Start()
    {
       rb = GetComponent<Rigidbody2D>();
       audiosource = GetComponent<AudioSource>();
       rb.gravityScale = 1;
    }

    void Update()
    {
        float moverHorizontal = 0f;
        float moverVertical = 0f;
        if (Input.GetKey(KeyCode.A))
        {
            moverHorizontal = -speed;
            isOnGround = false;
            rb.gravityScale = 0;
        }
        if (Input.GetKey(KeyCode.D))
        {
            moverHorizontal = speed;
            isOnGround = false;
            rb.gravityScale = 0;
        }
        if (Input.GetKey(KeyCode.W))
        {
            moverVertical = speed;
            isOnGround = false;
            rb.gravityScale = 0;
        }
        if (Input.GetKey(KeyCode.S))
        {
            moverVertical = -speed;
            isOnGround = false;
            rb.gravityScale = 0;
        }
        transform.Translate(new Vector3(moverHorizontal, moverVertical, 0) * Time.deltaTime);
        if (isOnGround)
        {
            Debug.Log("Jogo iniciado");
        }
        if (isLanding)
        {
            Debug.Log("Gojira melhor banda de metal");
        }
    }

    void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.gameObject.CompareTag("Obstaculo"))
        {
            audiosource.PlayOneShot(chrashSound);
            Debug.Log("Perdeu!");
            Time.timeScale = 0;
        }
        else if (collision.gameObject.CompareTag("Pouso"))
        {
            isLanding = true;
            isOnGround = true;
            audiosource.PlayOneShot(landingSound);
            Time.timeScale = 0;
        }
    }
}
